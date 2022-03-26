package day10_Switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {
        //kullanicidan kacinci ay oldugunu alip
        //mevsim yazdiran bir switch olustur
        Scanner scan=new Scanner(System.in);
        int ayNo= scan.nextInt();

        //bu soruyu if else ile yapabiliriz ama 12 tane if else yazmaya luzum yok

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Lutfen 1-12 arasi gir");
        }

    }
}
