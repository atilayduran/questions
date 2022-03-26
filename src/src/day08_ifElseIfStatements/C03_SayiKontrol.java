package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin
        //sayilardan ikisi de pozitif ise sayilarin toplamini yazdir
        //ikisi de negatif ise carpimini yazdir
        //sayiliarkin ikisi farkli isaretse islem yapamazsin yazdir
        //sayilardan 0 a esit olan varsa sifir carpmaya gore yutan elemandir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        //sayilarin ikiside pozitif ise toplamini yazdir
        if (sayi1>0 && sayi2>0){
            System.out.println("Girdiginiz iki sayi pozitif oldugundan toplanlar= "+ (sayi1+sayi2));

        }
        //sayilarin ikisi de negatif ise
        else if (sayi1<0 && sayi2<0) {
            System.out.println("Girdiginiz iki sayi negatif oldugundan carpimlar= " + (sayi1 * sayi2));
        }else if (sayi1*sayi2<0){
            System.out.println("Farkli isaretlerde sayilarla islem yapamzsin");

        }else{
            System.out.println("0 olmaz");
        }

    }
}


