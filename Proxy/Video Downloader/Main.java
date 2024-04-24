public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("TypeScript tutorial");
        videoDownloader.getVideo("TypeScript tutorial");
        videoDownloader.getVideo("React tutorial");
        
    }
}
