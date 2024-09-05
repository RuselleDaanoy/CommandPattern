public class PauseMusicCommand implements Command {
    private MusicPlayer musicPlayer;

    public PauseMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.pause();
    }
}