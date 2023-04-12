package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args){
        Movie harryPotter = new Movie("Harry Potter", 100);
        Movie esdla = new Movie("El Señor de los Anillos", 200);

        System.out.println("Title: " + harryPotter.getTitle());
        System.out.println("Duration: " + harryPotter.getDuration());
        Movie.getAlert();
        System.out.println(esdla.toString());
        System.out.println(harryPotter.IS_GOOD);

        HorrorMovie scream = new HorrorMovie("Scream", 138, false);
        System.out.println(scream.getTitle() + scream.isReallyScary());
        System.out.println(scream.toString());
    }

    public static Movie movieCreator(String title, int duration){
        return new Movie(title, duration);
    }
}
