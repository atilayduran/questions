package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //soru7)kullanicidan ismini alip isminin bas harfini yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        char ilkHarf = scan.next().charAt(0);
        //charAt(index) method'u parametre olarak yazdigimiz indexdeki chari bize getirir
        //String de index 0 dan baslar
        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);


    }

}
