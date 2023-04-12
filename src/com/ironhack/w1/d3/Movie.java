package com.ironhack.w1.d3;

public class Movie {
    private String title;
    private int duration;
    public final boolean IS_GOOD = true; // constante (no se puede modificar su valor)

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Movie(String title) {
        this.title = title;
        this.duration = 90; //default value
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void getAlert(){
        System.out.println("It's illegal to copy this movie");
    }

    @Override //decorador, hace que el codigo sea mas eficiente (funciona tambien sin el)
    public String toString(){
        return "Movie{" +
                "Title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}

