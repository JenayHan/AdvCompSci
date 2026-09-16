public class SongTester {
    public static void main(String[] args) {
        Song song1 = new Song("Blinding Lights", "The Weeknd", 180);
        double minutes = song1.getDurationMinutes();
        String initial = song1.getArtistInitial();
        int titleLen = song1.getTitleLength();
        System.out.println("Song: " + song1);
        System.out.println("Minutes: " + minutes);
        System.out.println("Artist Initial: " + initial);
        System.out.println("Title Length: " + titleLen);

        Song original = new Song("Blinding Lights", "The Weeknd", 180);
        Song alias = original;
        alias.setArtist("Weeknd");
        System.out.println(original.getArtist());
        
        Song a = new Song("Blinding Lights", "The Weeknd", 180);
        Song b = new Song("Blinding Lights", "The Weeknd", 180);
        System.out.println(a == b);
        System.out.println(a.equals(b));  
    }
}
