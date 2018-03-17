package HomeWorks.HomeWork7;

/**
 * Created by MARIA on 16.10.17.
 */
public class Player3 extends SuperPlayer {
    private int price;
    private String[] playlist;

    public Player3(int price) {
        this.price = price;
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }

    @Override
    public void playAllSongs() {
        for(String temp : playlist) {
            System.out.println("Playing: " + temp);
        }
    }

    //getters&setters
    public String[] getSongs() {
        return playlist;
    }

    public void setSongs(String[] songs) {
        this.playlist = songs;
    }
//
}
