package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Mijlen
	System.out.println("Typ het aantal mijlen:");
	double mijlen = scanner.nextDouble();
    double kilometers = mijlen * 1.6;

    //Kilometers
    int kommas = (int) (kilometers * 10);
    kilometers = kommas / 10.0;
    System.out.println(mijlen + "mijlen is " + kilometers + " kilometer");

    }
}
