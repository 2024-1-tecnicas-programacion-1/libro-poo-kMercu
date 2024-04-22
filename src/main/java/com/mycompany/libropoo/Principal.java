package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String title = sc.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String author = sc.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int yearOfPublication = sc.nextInt();


        Libro libro = new Libro(title, author, yearOfPublication);
            libro.marcarLeido();

        System.out.println(libro.mostrarInformacion());
        System.out.println("¿El libro ha sido leído? " + (libro.getLeido() ? "Sí" : "No"));
        System.out.println("¿El libro es antiguo? " + (libro.esAntiguo() ? "Sí" : "No"));

        sc.close();
    }
}