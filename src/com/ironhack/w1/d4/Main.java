package com.ironhack.w1.d4;

public class Main {
    public static void main(String[] args) {
        //Player player = new Player(0.5, 1); Not allowed to create objects from abstract classes
        Player webPlayer = new WebPlayer(0.3, 2);

        System.out.println(webPlayer.getCurrentTrack());
        AndroidPlayer androidPlayer = new AndroidPlayer(0.8, 3);
        IPlayable androidPlayer2 = new AndroidPlayer(0.5, 4);
        androidPlayer.close();
        androidPlayer.play();
        //*androidPlayer2.close(); // type Interface its limited to its own methods
    }
}
