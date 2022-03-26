package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
//eger kullanici gun ismini yanlis girerse " aptal misin " yazdir
//  Ornek:  gun=Pazar output = “Hafta sonu”
// gun=Sali output = “Hafta ici”
// *** String icin equals method’unu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismi gir");
        String gunIsmi = scan.next().toLowerCase();
        //hatali girisleri de yazdirmak icin olasiliklari 3 e cikardim
        //haftasonu - hafta ici- yanlis giris
        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("hici");
        } else {
            System.out.println("yanlis girdin aptal misin");
       //eger if else if .. . statement else ile bitiyosa olasiliklardan bir tanesi mutlaka calisir
        //if else if.. cumleleri else ile bitmese de calisir
        // ancak bu durumda sadece bir olasilik calisabilir veya hic bir islem yapilmayabilir

        }
    }
}
