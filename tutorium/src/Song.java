public class Song {

    private String title;

    private Artist artist;

    private String genre;

    private int length;

    public Song(
            String title,
            Artist artist, // now an artist instead of a string
            String genre,
            int length
    ) {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setLength(length);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setLength(int length) {
        if (0 > length) {
            this.length = 0;
            return;
        }

        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void displaySongInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist Name: " + artist.getName());
        System.out.println("Genre: " + genre);
        System.out.println("Length: " + length + " seconds");
    }
}