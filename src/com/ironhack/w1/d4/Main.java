package com.ironhack.w1.d4;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(0.5, 1);
        Player webPlayer = new WebPlayer(0.3, 2);

        System.out.println(player.getCurrentTrack());
        System.out.println(webPlayer.getCurrentTrack());
    }
}
