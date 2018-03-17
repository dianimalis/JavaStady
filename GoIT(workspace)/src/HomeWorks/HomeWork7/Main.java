package HomeWorks.HomeWork7;


/**
 * Created by MARIA on 16.10.17.
 */
public class Main {
    public static void main(String[] args) {

        Player1 player1 = new Player1(100);
        player1.setSongs(new String[]{"Grenade", "Express your self","Come along", "About us","Stop","Love me tender"});

        player1.playSong();
        player1.playAllSongs();

        Player6 player6 = new Player6(350);
        player6.setPlaylist(new String[]{"6 God","From 1 to a 100", "HUMBLE","DNA"});
        player6.playSong();
        player6.playAllSongs();
        System.out.println("Doing shuffle: " );
        player6.shuffle();

    }
}
