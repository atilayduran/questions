package day12_StringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        //kullanicidan isim soy isim al
        //butun harfleri * al
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isim soyisim gir");
        String isimSoyisim=scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S","*"));



    }
}
