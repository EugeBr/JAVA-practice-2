package com.ironhack.w1.d4;

public class Main {
    public static void main(String[] args) {
        //Player player = new Player(0.5, 1); Not allowed to create objects from abstract classes
        Player webPlayer = new WebPlayer(0.3, 2);

        System.out.println(webPlayer.getCurrentTrack());
    }
}
