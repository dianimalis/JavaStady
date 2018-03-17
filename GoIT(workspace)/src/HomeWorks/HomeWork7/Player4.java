package HomeWorks.HomeWork7;

/**
 * Created by MARIA on 16.10.17.
 */
public class Player4 extends SuperPlayer {

    private int price;
    private String[] playlist;

    public Player4(int price) {
        this.price = price;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist[playlist.length-1]);
//        playlist.length-1
    }

    @Override
    public void playAllSongs() {
        for(String temp : playlist) {
            System.out.println("Playing: " + temp);
        }
    }

    //getters&setters
    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }
}
