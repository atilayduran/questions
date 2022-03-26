package day13_StringManipulation;

import java.util.Scanner;
//Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
////
////yazdirin
//
//isim-soyisim : M***** B*******
//kart no : **** **** **** 1234
public class odev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ismini giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim = scanner.nextLine();
        System.out.println("Lütfen kredi kartı numaranızı yazınız : ");
        String kartNo = scanner.nextLine();
        String isimYeni = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        String soyIsimYeni = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");
        System.out.println(isimYeni + " " + soyIsimYeni);
        System.out.println(kartNo.substring(0, 4).replaceAll("\\d", "*") +" "+
                kartNo.substring(4,8).replaceAll("\\d", "*") + " "+ kartNo.substring(8,12).replaceAll("\\d", "*")+" "+ kartNo.substring(12,16));
    }
}