public class NextTrackCommand implements Command {
    private MusicPlayer musicPlayer;

    public NextTrackCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.nextTrack();
    }
}