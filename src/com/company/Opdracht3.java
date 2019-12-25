package com.company;

import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Startbedrag
        System.out.println("Typ het start bedrag");
        double startbedrag = scanner.nextDouble();

        // Rentepercentage + Rentebedrag
        System.out.println("Typ het rentepercentage");
        double rentepercentage = scanner.nextDouble();
        double rentebedrag = rentepercentage / 100 * startbedrag;
        double totaalbedrag = startbedrag + rentebedrag;
        System.out.println("De rente is" + rentebedrag + "end het totaalbedrag is " + totaalbedrag);

    }
}
