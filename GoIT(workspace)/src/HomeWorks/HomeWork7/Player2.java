package HomeWorks.HomeWork7;

/**
 * Created by MARIA on 16.10.17.
 */
public class Player2 extends SuperPlayer {
    private int price;
    private String song;

    public Player2(int price) {
        this.price = price;
    }


    public void playSong() {
        System.out.println("Playing: " + song);
    }


    //getters&setters
    public String getSongs() {
        return song;
    }
    public void setSong(String song) {
        this.song = song;
    }
}
