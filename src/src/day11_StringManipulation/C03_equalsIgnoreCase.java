package day11_StringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        //kullaniciya derse katilip katilmak istemedigini sorun
        //evet derse, cevabini ve "derse katilimiiniz alinmisitr" yazdir
        // hayir derse cevabini ve "sonraki derslerimize bekleriz" yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniz? \nEver veya haayir yaziniz");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabiniz : " + cevap + "derse katiliminiz onaylanmistir");
        }else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("cevabiniz : " + cevap + "Sonraki dersoimize beklerz");
        }else{
            System.out.println("lutfen evet veya hayir yaz");
        }


    }
}
