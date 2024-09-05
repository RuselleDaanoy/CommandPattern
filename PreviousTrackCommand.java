public class PreviousTrackCommand implements Command {
    private MusicPlayer musicPlayer;

    public PreviousTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.previousTrack();
    }
}