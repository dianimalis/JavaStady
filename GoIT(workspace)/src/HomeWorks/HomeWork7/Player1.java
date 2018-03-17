package HomeWorks.HomeWork7;

/**
 * Created by MARIA on 16.10.17.
 */
public class Player1 extends SuperPlayer {
    private int price;
    private String[] songs;


//getters&setters
    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }
//

    @Override
    public void playSong() {
        System.out.println("Playing: " + songs[0]);
//        songs.length-1
    }

    @Override
    public void playAllSongs() {
        for(String temp : songs) {
            System.out.println("Playing: " + temp);
        }
    }



    public Player1(int price) {
        this.price = price;
    }





}
