import java.util.HashMap;
import java.util.Map;

//implement exception handling
public class ProxyVideoDownloader implements VideoDownloader {

    //store mappings of video names (keys) to Video objects (values).
    private final Map<String, Video> videoCache = new HashMap<>();
    private final VideoDownloader downloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        try {
            if (!videoCache.containsKey(videoName)) {
                videoCache.put(videoName, downloader.getVideo(videoName));
            }
            System.out.println("Retrieving video from cache...");
            System.out.println("-----------------------");
            return videoCache.get(videoName);
        } catch (Exception e) {
            System.out.println("An error occurred while getting the video: " + e.getMessage());
            // You can choose to return null or throw a custom exception here based on your requirements
            return null;
        }
    }
    

}