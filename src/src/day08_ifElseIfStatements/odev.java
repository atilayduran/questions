package day08_ifElseIfStatements;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        //Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        //
        //Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        //“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre gir");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);

        if (ilkHarf >= 'A' || ilkHarf <= 'Z') {

            if (ilkHarf == 'A') {
                System.out.println("Gecerli sifre girdin");
            } else {
                System.out.println("Gecersiz sifre");
            }
        }
        else if (ilkHarf >= 'a' || ilkHarf <= 'z') {

             if (ilkHarf == 'z') {
                System.out.println("Gecerli sifre girdin");
            } else {
                System.out.println("Gecersiz sifre");
            }
        }
    }
}