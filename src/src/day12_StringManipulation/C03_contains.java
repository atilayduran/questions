package day12_StringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa
        // “Email adresiniz kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email="mulkiyeayboy@gmail.com";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi yaz");
        }else if (email.lastIndexOf(arananMetin)==(email.length()-10)){//10 gmailin baslangicina denk geliyo
            System.out.println("email adresi kaydoldu");



    }else{
            System.out.println("kontrol et");
        }
}}
