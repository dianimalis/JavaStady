package HomeWorks.HomeWork7;

/**
 * Created by MARIA on 16.10.17.
 */
public class Player5 extends SuperPlayer {
    private int price;
    private String[] playist;

    public Player5(int price) {
        this.price = price;
    }


    public void playSong() {
        System.out.println("Playing: " + playist[0]);
    }

    @Override
    public void playAllSongs() {
        for (int i = (playist.length-1); i>= 0; i--){
            System.out.println("Playing: " + playist[i]);
        }
    }


    //getters&setters
    public String[] getPlayist() {
        return playist;
    }

    public void setPlayist(String[] playist) {
        this.playist = playist;
    }
}
