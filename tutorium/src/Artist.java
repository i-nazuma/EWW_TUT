public class Artist {

    private String name;
    private String genre;
    private int activeSince;

    public Artist(String name, String genre, int activeSince) {
        this.name = name;
        this.genre = genre;
        this.activeSince = activeSince;
    }

    public Artist() {
        setName("Unbekannt");
        setGenre("Unbekannt");
        setActiveSince(0000);
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getActiveSince() {
        return activeSince;
    }

    public void setActiveSince(int activeSince) {
        this.activeSince = activeSince;
    }

    public void displayArtistInfo () {
        System.out.println("Artist Name: " + name);
        System.out.println("Genre " + genre);
        System.out.println("Active since: " + activeSince);
    }
}
