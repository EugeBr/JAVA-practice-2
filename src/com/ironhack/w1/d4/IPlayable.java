package com.ironhack.w1.d4;

public interface IPlayable {
    public abstract void play(); //* not necessary to declare public abstract, it is by default
    void pause();
    void mute();
    void increaseVolume();

    final double MAX_VOLUME = 1; //* no need to write final
    //* constants are not mandatory to use
}
