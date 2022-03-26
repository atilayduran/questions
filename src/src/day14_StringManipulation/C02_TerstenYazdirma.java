package day14_StringManipulation;

import java.util.Scanner;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve
       //ilk harf buyuk digerleri kucuk olsn
        // girilen kelimeyi tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("tersten kelime ");
        String input= scan.next();

        String tersStr= input.substring(3).toUpperCase() +
                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();
        System.out.println(tersStr);
    }
}
