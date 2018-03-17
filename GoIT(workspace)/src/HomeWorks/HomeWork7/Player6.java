package HomeWorks.HomeWork7;

/**
 * Created by MARIA on 16.10.17.
 */
public class Player6 extends SuperPlayer {
    private int price;
    private String[] playlist;

    public Player6(int price) {
        this.price = price;
    }


    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }
    @Override
    public void playAllSongs() {
        for(String temp : playlist) {
            System.out.println("Playing: " + temp);
        }
    }

    public void shuffle() {
        for (String temp : playlist) {
            int index = (int)Math.random()* playlist.length;
            System.out.println("Playing: " + playlist[index]);
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
