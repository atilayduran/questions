package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {
//Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
//  Ornek:  gun=Pazar output = “Hafta sonu”
// gun=Sali output = “Hafta ici”
// *** String icin equals method’unu kullanin
//ctesi veya pazartesi ise = haftasonu
        //pazartesi veya sali veya cars veya pers veya cuma ise = hafta ici

        //String case sensitivedir
        //yani pazar, Pazar, PAZAR bunlar hep farki kelime
        //bu durumda String methodlarindan yardim aliriz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toLowerCase();//kullanici ne yazarsa yazsin kucuk harfe cevirilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");

        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("girdginiz gun hafta ici");
        }
    }
}
