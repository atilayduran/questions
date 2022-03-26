package day13_StringManipulation;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        //Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa
        // “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        // - Ilk harf buyuk harf olmali xxx
        //- Son harf kucuk harf olmali xxx
        //- Sifre bosluk icermemeli xx
        //- Sifre uzunlugu en az 8 karakter olmali xx
        Scanner scan = new Scanner(System.in);
        System.out.println("sifre gir");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);
        char sonHarf = sifre.charAt(sifre.length() - 1);
        //if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
           // if (sonHarf >= 'a' && sonHarf <= 'z');
        //    if (sifre.length()>=8);
        if (ilkHarf>='A' && ilkHarf<='Z' && sonHarf>='a' && sonHarf<='z'
        && !sifre.contains(" ")&& sifre.length()>=8){
            System.out.println("calisiyor");

        }else {
            System.out.println("basarisiz");
        }
    }

}