public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();
        
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);
        
        // Watching a movie using the facade
        homeTheater.watchMovie("Inception");
        
        // Ending the movie and shutting down the home theater
        homeTheater.endMovie();
    }
}
