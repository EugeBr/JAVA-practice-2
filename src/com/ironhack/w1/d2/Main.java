package com.ironhack.w1.d2;

public class Main {
    public static void main(String[] args) {

// ARRAYS
        String[] names = {"Cristina", "Paul", "Maria", "John"};

//LOOPS
// for loop
        System.out.println("==== For ====");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            if(names[i].equals("Maria")) break; //condition to stop loop
        }

// foreach loop
        System.out.println("==== Foreach ====");
        for (String name : names) {
            System.out.println(name);
        }

// while loop
        System.out.println("==== While ====");
        int i = 0;
        while (i < names.length) {
            System.out.println(names[i++]);
        }

// do while loop
        System.out.println("==== Do while ====");
        i = 0;
        do {
            System.out.println(names[i++]);
        } while (i < names.length);

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[2]); //no imprime el array solo la posicion de memoria "[Ljava.lang.String;@e9e54c2"
        System.out.println(subjectsArray[2]);
    }

    // how to create a new array
    public static String[] createSubjectsArray(){
        String[] subjects = new String[5];
        subjects[0] = "Matematicas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Biologia";
        subjects[4] = "Quimica";

        return subjects;
    }
}