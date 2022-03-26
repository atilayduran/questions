package day08_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {
        //kullanicidan 100 uzerinden not iste, notu harf sistemine cevirip yazdir
        //50 den kcukse d
        //50-60 arasi c
        //60-80 arasi b
        //90 uzeri a
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double notSayi= scan.nextDouble();
if (notSayi<0 || notSayi>100){
    System.out.println("Lutfen salak salak yazma");
}
        else if (notSayi<50){
            System.out.println("notunuz D");

        }else if (notSayi<60){
            System.out.println("Notunuz C");
        }else if (notSayi<80){
            System.out.println("notunuz B");
        }else{
            System.out.println("Notunuz A");
        }

    }
}
