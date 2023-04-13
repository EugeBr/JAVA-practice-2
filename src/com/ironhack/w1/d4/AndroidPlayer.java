package com.ironhack.w1.d4;

public class AndroidPlayer extends Player implements IPlayable, IShareble {
    //! we can implement multiple interfaces
    public AndroidPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing Android player");
    }

    @Override
    public void play() {
        System.out.println("Playing Android Player");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Android Player");
    }

    @Override
    public void mute() {
        setVolume(0);
    }

    @Override
    public void increaseVolume() {
        setVolume(getVolume() + 0.1);
        if (getVolume() > MAX_VOLUME) setVolume(MAX_VOLUME);
        //* constant MAX_VOLUME set in IPlayable interface
    }

    @Override
    public String share() {
        return "Sharing...";
    }
}
