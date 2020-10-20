package Yee;

import java.util.*;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        char o;
        int bil1, bil2;

        System.out.print("Silahkan Masukkan Operator Yang Diinginkan : ");
        o = S.next().charAt(0);
        System.out.print("Masukkan Bilangan Pertama : ");
        bil1 = S.nextInt();
        System.out.print("Masukkan Bilangan Kedua : ");
        bil2 = S.nextInt();

        switch (o) {
            case '+' -> System.out.println(bil1 + " + " + bil2 + " = " + (bil1 + bil2));
            case '-' -> System.out.println(bil1 + " - " + bil2 + " = " + (bil1 - bil2));
            case '/' -> System.out.println(bil1 + " / " + bil2 + " = " + (bil1 / bil2));
            case '*' -> System.out.println(bil1 + " * " + bil2 + " = " + (bil1 * bil2));
            case '%' -> System.out.println(bil1 + " % " + bil2 + " = " + (bil1 % bil2));
        }


    }



}
