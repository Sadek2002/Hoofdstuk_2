package com.company;

import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // Jaren
        System.out.println("Hoeveel jaar oud ben je?");
        int jaar = scanner.nextInt();

        // Maanden
        System.out.println("Hoeveel maanden komen er daar nog bij?");
        int maanden = scanner.nextInt();

        // Minuten
        int minuten = jaar * 365 * 24 * 60 + maanden * 30 * 24 * 60;
        System.out.println("Dan ben je nu ongeveer " + minuten + " minuten oud");
    }
}
