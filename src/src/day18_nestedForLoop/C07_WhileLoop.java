package day18_nestedForLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //kullanicidan kac sayi toplamak istedigini alin
        //bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        int sayiAdedi = 5;
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        for (int i = 1; i < sayiAdedi; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;

        }
        System.out.println("girilen " + sayiAdedi + "sayinin toplami : " + toplam);

        //while ile yapalim
        sayi = 0;
        toplam = 0;
        int sayac = 1;

        while (sayac <= sayiAdedi) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;

        }
        System.out.println("girilen "+ sayiAdedi+"sayinin toplami : "+toplam);
    }
}