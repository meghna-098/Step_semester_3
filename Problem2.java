public class Problem2 {

    static class Playlist {

        // Private array
        private String[] songs;

        // Number of songs currently added
        private int songCount;

        // Constructor
        public Playlist(int maxSongs) {

            songs = new String[maxSongs];
            songCount = 0;
        }

        // Add a song
        public void addSong(String song) {

            // Check whether playlist is full
            if (songCount >= songs.length) {

                System.out.println(
                    "Cannot add song: playlist is full"
                );

                return;
            }

            // Add song
            songs[songCount] = song;

            // Increase count
            songCount++;
        }

        // Return a copy of the songs
        public String[] getSongs() {

            // Create a new array containing only
            // the songs that were actually added
            String[] copy = new String[songCount];

            // Copy the contents
            for (int i = 0; i < songCount; i++) {
                copy[i] = songs[i];
            }

            return copy;
        }

        // Return number of songs
        public int getSongCount() {
            return songCount;
        }
    }

    public static void main(String[] args) {

        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        System.out.println(
            "Song count: " + p.getSongCount()
        );

        String[] copy = p.getSongs();

        System.out.println("Songs before modification:");

        for (String song : copy) {
            System.out.println(song);
        }

        // Modify the returned array
        copy[0] = "Hacked";

        System.out.println(
            "Modified copy[0]: " + copy[0]
        );

        // Get a fresh copy from playlist
        String[] actualSongs = p.getSongs();

        System.out.println(
            "Playlist's first song: "
            + actualSongs[0]
        );
    }
}
