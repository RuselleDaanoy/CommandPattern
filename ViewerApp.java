public class ViewerApp {
    public static void main(String[] args) {
        // Initialize devices
        Tv tv = new Tv();
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl rc = new RemoteControl(); 
        
        // Tv Command
        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());

        // Light Commands
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(livingRoomLight);
        System.out.println(turnOnLightCommand.execute());

        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(livingRoomLight);
        System.out.println(turnOffLightCommand.execute());

        IncreaseBrightnessCommand increaseBrightnessCommand = new IncreaseBrightnessCommand(livingRoomLight);
        System.out.println(increaseBrightnessCommand.execute());

        DecreaseBrightnessCommand decreaseBrightnessCommand = new DecreaseBrightnessCommand(livingRoomLight);
        System.out.println(decreaseBrightnessCommand.execute());

        // Thermostat Commands
        IncreaseTemperatureCommand increaseTemperatureCommand = new IncreaseTemperatureCommand(thermostat);
        System.out.println(increaseTemperatureCommand.execute());

        DecreaseTemperatureCommand decreaseTemperatureCommand = new DecreaseTemperatureCommand(thermostat);
        System.out.println(decreaseTemperatureCommand.execute());
        
        // Music Player Commands
        PlayMusicCommand playMusicCommand = new PlayMusicCommand(musicPlayer);
        System.out.println(playMusicCommand.execute());

        PauseMusicCommand pauseMusicCommand = new PauseMusicCommand(musicPlayer);
        System.out.println(pauseMusicCommand.execute());

        NextTrackCommand nextTrackCommand = new NextTrackCommand(musicPlayer);
        System.out.println(nextTrackCommand.execute());

        PreviousTrackCommand previousTrackCommand = new PreviousTrackCommand(musicPlayer);
        System.out.println(previousTrackCommand.execute());
    }
}
