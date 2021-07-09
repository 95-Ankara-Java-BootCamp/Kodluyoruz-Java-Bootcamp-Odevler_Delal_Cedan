package FirstWeek;

import java.util.Scanner;

/*
    manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program

    Meyveler ve KG Fiyatları:
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL

 */

public class Homework_2 {
    public static void main(String[] args) {
        double armKg, elmaKg, domKg, muzKg, patKg;
        double armF = 2.14, elmaF = 3.67, domF = 1.11, muzF = 0.95, patF = 5.00;
        double armT, elmaT, domT, muzT, patT, toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kac kilo ?");
        armKg = input.nextDouble();
        armT = armF * armKg;

        System.out.print("Elma kac kilo ? ");
        elmaKg = input.nextDouble();
        elmaT = elmaF * elmaKg;

        System.out.print("Domates kac kilo ?");
        domKg = input.nextDouble();
        domT = domF * domKg;

        System.out.print("Muz kac kilo ?");
        muzKg = input.nextDouble();
        muzT = muzKg * muzF;

        System.out.print("Patlican kac kilo ?");
        patKg = input.nextDouble();
        patT = patF * patKg;

        toplam = armT + elmaT + domT + muzT + patT;
        System.out.print("Toplam : " +toplam+ " TL ");

    }
}

