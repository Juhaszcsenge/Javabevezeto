package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát:");
        double a = sc.nextDouble();
        System.out.print("Kérem adja meg a téglalap 'b' oldalát:");
        double b = sc.nextDouble();

        System.out.print("Kérem adja meg az elvégzendő műveletet K-(kerület) vagy T-(terület)!");
        String muvelet = sc.nextLine();
        if(muvelet.equals("K")){
            double kerulet = 2 * (a + b);
            System.out.printf("A téglalap kerülete: %f", kerulet);
        }
        else if(muvelet.equals("T")){
            double terulet = a * b;
            System.out.printf("A téglalap területe: %f", terulet);
        }
        else {
            System.out.println("Rossz!");
        }
        if(a == b){
            System.out.println("Ez egy négyzet!");

        }
    }
}
