package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //kullanicidan ismini ve soyisimini alip aralrinda bir bosluk olustrarak asagidaki gibi yazdir
        // Isim - Soysiimn : mehmet bulutoz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi yaz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisim gir");
        String soyisim= scan.nextLine();

        System.out.println("Isim - Soyisim : "+ isim +" "+soyisim);
    }
}
