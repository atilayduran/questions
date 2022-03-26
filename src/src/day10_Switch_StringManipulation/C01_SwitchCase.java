package day10_Switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //kullanicidan sayi olarak ay numarasini alip
        //ay ismini yazdiran bi program yaz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacinci ay istediginizi giriniz");
        int ayNo= scan.nextInt();

        //bu soruyu if else ile yapabiliriz ama 12 tane if else yazmaya luzum yok

        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Lutfen 1-12 arasi gir");
        }
//switch icine yazilan variable in degerine gore
        // ilgili case i bulur ve break forene kadar kodu calistirir
        //eger break yoksa asagi dogru tumu calisir
        //if else deki else gibi bi satir ekleyebilirz
        //default

    }
}
