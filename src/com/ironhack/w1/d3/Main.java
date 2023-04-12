package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args){
        Movie harryPotter = new Movie("Harry Potter", 100);
        Movie esdla = new Movie("El Señor de los Anillos", 200);

        System.out.println("Title: " + harryPotter.getTitle());
        System.out.println("Duration: " + harryPotter.getDuration());
        Movie.getAlert();

    }
}
