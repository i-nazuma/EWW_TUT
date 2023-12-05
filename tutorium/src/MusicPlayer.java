
public class MusicPlayer {

    public static void main(String[] args) {

        Artist artist1 = new Artist();
        Artist artist2 = new Artist("Max M", "Pop", 2010);
        Song track1 = new Song(
                "TTSG",
                artist1,
                "Pop",
                400
        );
        Song track2 = new Song(
                "TTSG",
                artist2,
                "Pop",
                400
        );
        Song track3 = new Song(
                "TTSG",
                artist2,
                "Pop",
                400
        );
        Playlist p1 = new Playlist(
                "Party Mix",
                5
        );
        track1.displaySongInfo();
        track2.displaySongInfo();
        track3.displaySongInfo();

        p1.addSong(track1);
        p1.addSong(track2);
        p1.addSong(track3);

        Song[] allSongs = p1.getSongs();

        allSongs[0].displaySongInfo();

        System.out.printf(
                "Total Runtime in Seconds: %d",
                p1.getTotalRuntime()
        );
    }
}