package day08_ifElseIfStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {
        //girilen bir karakterin, harf olup olmadigini bul

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karakter gir");
        char karakter=scan.next().charAt(0);

        if (karakter>='A' && karakter<='Z' || karakter>='a' && karakter<='z'){
            System.out.println("girdginiz karakter harf");
    }else{
            System.out.println("girdiginiz karakter harf degil");
        }
        Character.isLetter(karakter);
}}
