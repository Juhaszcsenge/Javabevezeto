package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adja meg a medence átmérőjét!");
        double atmero = sc.nextDouble();

        System.out.print("Kérem adja meg a medence mélységét!");
        double melyseg = sc.nextDouble();

        double sugar = atmero/2;
        double terulet = sugar * sugar * Math.PI;
        double terfogat = terulet * melyseg;

        System.out.printf("A medencében %f víz fér bele.", terfogat);



    }
}



















