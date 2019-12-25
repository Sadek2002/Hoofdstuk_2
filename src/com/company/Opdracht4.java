package com.company;

import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 tot 100 + 5 Getallen
        System.out.println("Typ een getal tussen 10 en 100");
        int getal = scanner.nextInt();
        int getal1 = getal - 2;
        int getal2 = getal - 1;
        int getal4 = getal + 1;
        int getal5 = getal + 2;
        System.out.println("De vijf getallen zijn " + getal1 + " - " + getal2 + " - " + getal + " - " + getal4 + " - " + getal5);
    }
}
