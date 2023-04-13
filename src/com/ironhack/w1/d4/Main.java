package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

//? ABSTRACT CLASSES AND INTERFACES

        //Player player = new Player(0.5, 1); Not allowed to create objects from abstract classes
        Player webPlayer = new WebPlayer(0.3, 2);

        System.out.println(webPlayer.getCurrentTrack());
        AndroidPlayer androidPlayer = new AndroidPlayer(0.8, 3);
        IPlayable androidPlayer2 = new AndroidPlayer(0.5, 4);
        androidPlayer.close();
        androidPlayer.play();
        //*androidPlayer2.close(); // type Interface its limited to its own methods

//? BIG DECIMAL

        System.out.println(1.2 - 1.0); //* result is not exact
        BigDecimal bd1 = new BigDecimal("31.2254546663"); //! it has to be passed as a string
        BigDecimal bd2 = new BigDecimal("12.075476767");

        //bd1 - bd2     not possible
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN)); //*to divide we need provide Rounding mode
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN)); //*to round a number
        System.out.println(bd1.compareTo(bd2)); //*comparing (result= 1, 0, -1)
    }
}
