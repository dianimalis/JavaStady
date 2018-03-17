package HomeWorks.HomeWork7;

/**
 * Created by MARIA on 16.10.17.
 */
public class Song {
//    private String song; ( + changing it to this everytime)
    public Song(String songName) {
        Song song = new Song(songName);
    }

    public void playSong(Song song){
        System.out.println("Playing:\t" + song);
    }

    public void playAllSongs(String[] playlist) {
        System.out.println("Playing all songs");
        for(int i = 0;i < playlist.length;i++) {
            System.out.println("Playing:\t" + playlist[i]);
        }

    }

}
