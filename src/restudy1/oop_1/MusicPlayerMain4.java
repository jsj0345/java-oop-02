package restudy1.oop_1;

public class MusicPlayerMain4 {
  public static void main(String[] args) {
    MusicPlayer musicPlayer = new MusicPlayer();

    musicPlayer.on();
    musicPlayer.volumeUp();
    musicPlayer.volumeUp();
    musicPlayer.volumeDown();
    musicPlayer.showStatus();
    musicPlayer.off();
  }
}
