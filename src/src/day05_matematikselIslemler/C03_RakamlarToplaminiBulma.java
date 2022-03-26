package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanicidan aldigniz 4 basamakli sayinin
        //basamaklardaki rakam toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi gir kopek");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;
        //1.adim r=0 rakamtoplami=0 sayi=7532

        rakam=sayi%10; //birler basamagini yani 2 yi verir
        rakamlarToplami +=rakam; //2
        sayi/=10; //753

        //2.adim r=2 rt=2 sayi=753

        rakam=sayi%10; //3
        rakamlarToplami+=rakam;//5 ( daha once 2 idi)
        sayi/=10;// sonrdaki 3 ten kurtulmak icin 75

        //3.adim r=3 rt=5 sayi=75
        rakam=sayi%10;//5
        rakamlarToplami += rakam; //10
        sayi/=10;//7

        rakam=sayi%10; //7 yi 10 a bolersen 7 kalir
        rakamlarToplami+=rakam;//17
        sayi/=10; //0.7 yani 0 kalir

        System.out.println("girdginiz sayinin rakamlar toplami " + rakamlarToplami);


    }
}
