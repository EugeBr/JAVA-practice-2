package com.ironhack.w1.d2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

// ARRAYS
        String[] names = {"Cristina", "Paul", "Maria", "John"};

//LOOPS
// for loop
        System.out.println("==== For ====");
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("Paul")) continue; //condition to skip that index
            System.out.println(names[i]);
            if(names[i].equals("Maria")) break; //condition to stop loop
        }

// how to store even numbers in array example
        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                evenNumbers[j] = i;
                j++;
            }
        }

        System.out.println(Arrays.toString(evenNumbers)); // how to print full array

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
// (executes at least ones)
        System.out.println("==== Do while ====");
        i = 0;
        do {
            System.out.println(names[i++]);
        } while (i < names.length);

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[2]); //no imprime el array solo la posicion de memoria "[Ljava.lang.String;@e9e54c2"
        System.out.println(subjectsArray[2]);

// MATH CLASS

        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(2, 5));
        System.out.println((int) Math.pow(2, 5)); //CASTING (pedimos un numero entero)

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