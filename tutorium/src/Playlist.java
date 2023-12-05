public class Playlist {

    private String title;

    private Song[] songs;

    private int songCount;

    public Playlist(String title, int maxSongs) {
        // TODO
        this.title = title;
        this.songs = new Song[maxSongs];
        this.songCount = 0;
    }

    public void addSong(Song song) {
        // TODO: Add a song to the playlist
        if (songCount == songs.length) {
            System.out.println("Playlist full");
            return;
        }

        songs[songCount] = song;
        songCount++;
    }

    public void removeSong(Song songToRemove) {
        for (int i = 0; i < songCount; i++) {
            if(songs[i].equals(songToRemove)) {
                //shift the rest of the books to fill the gap
                for(int j = i; j < songCount - 1; j++) {
                    songs[j] = songs[j+1];
                }
                songs[songCount - 1] = null; // set the last book to null
                songCount--; //decrease the book count
                System.out.println("Song " + songToRemove.getTitle() + "has been removed from the playlist.");
                return;
            }
        }
        System.out.println("Song not found in playlist");
    }

    public boolean removeSongByTitle(String title) {
        for (int i = 0; i < songCount; i++) {
            if(songs[i].getTitle().equals(title)) {
                for(int j = i; j < songCount - 1; j++) {
                    songs[j] = songs[j+1];
                }
                songs[songCount - 1] = null;
                songCount--;
                System.out.println("Song " + title + "has been removed from the playlist.");
                return true;
            }
        }
        System.out.println("Song not found in playlist");
        return false;
    }

    public int getTotalRuntime() {
        // TODO: return total runtime of all song
        int totalRuntime = 0;
        for (int i = 0; i < songCount; i++) {
            Song song = songs[i];
            totalRuntime += song.getLength();
            // totalRuntime += songs[i].getLength();
        }

        return totalRuntime;
    }

    public int getUniqueArtist() {
        // TODO
        return 0;
    }



    // TODO: Getter Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Song[] getSongs() {
        return songs;
    }

    public int getSongCount() {
        return songCount;
    }
}