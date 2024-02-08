package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        double radius = 6378.1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите широту и долготу первой точки в градусах: \n");
        double sh1 = scanner.nextDouble();
        double dl1 = scanner.nextDouble();

        System.out.println("Введите широту и долготу второй точки в градусах: ");
        double sh2 = scanner.nextDouble();
        double dl2 = scanner.nextDouble();
        scanner.nextLine();

        sh1 = Math.toRadians(sh1);
        dl1 = Math.toRadians(dl1);
        sh2 = Math.toRadians(sh2);
        dl2 = Math.toRadians(dl2);
        double raznizaSH = sh2 - sh1;
        double raznizaDL = dl2 - dl1;
        double a = Math.pow(Math.sin(raznizaSH / 2), 2) + Math.cos(sh1) * Math.cos(sh2) * Math.pow(Math.sin(raznizaDL / 2), 2);
        double b = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double rez = radius * b;
        System.out.println("Расстояние между двумя точками = " + rez + "км");
        scanner.close();
    }
}