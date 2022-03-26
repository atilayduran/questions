package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {
//Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi gir amin oglu");
        int sayi = scan.nextInt(); // kullanicidan sayiyi aldik

        if (sayi % 2 == 0) {
            System.out.println("Cift sayi");

        }
        if (sayi % 2 != 0) {
            System.out.println("tek sayi");
        }
        //normalde bir sayi ya tek ya cifttir
        //if else ile tek statement da yapmak daha ii olur
        // =========if else ile cozum===========

        if (sayi%2==0) {
            System.out.println("girdginiz sayi cift sayidir");
        }else{
            System.out.println("girdginiz sayi tek sayidir");
        }
        }
}
