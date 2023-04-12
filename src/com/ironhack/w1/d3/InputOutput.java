package com.ironhack.w1.d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

// STANDARD INPUT/OUTPUT

        System.out.println("Prueba de salida por consola");
        System.err.println("Prueba de salida de error por consola");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce your name");

        String name = scanner.nextLine(); //takes value in a variable
        System.out.println("Hello " + name);

        System.out.println("Now introduce your age");
        int age = scanner.nextInt();

//        while (age < 0) {
//            System.err.println("Your age cannot be negative");
//            age = scanner.nextInt();
//        }
//
//        if (age > 18) {
//            System.out.println("Welcome this app");
//        } else {
//            System.out.println("Access forbidden");
//        }

        scanner.close();

// FILE HANDLING

        String filePath = "src/com/ironhack/w1/d3/fichero.txt";

        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya existía");
        }

        FileWriter fileWriter = new FileWriter(filePath, true);  //true = info nueva se agrega al final del contenido existente
                                                                        //false = reemplaza la info vieja por la nueva
        fileWriter.write("Esto es una linea\n"); // "\n" = salto de linea
        fileWriter.write("Esto es otra linea\n");
        fileWriter.close();

        Scanner fileScanner = new Scanner(file);
        String str = "";
        while (fileScanner.hasNextLine()){
            str += fileScanner.nextLine() + "\n";
            System.out.println(str);
        }
        fileScanner.close();
    }
}




