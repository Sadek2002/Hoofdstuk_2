package com.company;

import java.util.Scanner;

public class Opdracht5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Typ een getal tussen 0 en 1000: ");
            int userInput = scanner.nextInt();

            int getal3 = userInput % 10;
            userInput = userInput / 10;

            int getal2 = userInput % 10;
            userInput = userInput / 10;

            int getal1 = userInput;

            int product = getal1 * getal2 * getal3;

            System.out.println("Der vermenigvuldiging van de cijfers luidt: " + getal1 + " x " + getal2 + " x " + getal3 + " = " + product);


        }
}
