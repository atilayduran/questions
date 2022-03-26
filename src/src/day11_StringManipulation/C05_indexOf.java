package day11_StringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel";
//istersek char olarak verdigimiz bir harfin indexini bize dondurur
        str1.indexOf('J');//0

        //istersek bir harf yada metin olara verdigimiz Strining indexini dondurur


        System.out.println(str1.indexOf("l"));//19
        System.out.println(str1.length()-1);//19
        System.out.println(str1.indexOf("aska"));//10

        //ayni harfden birden fazla varsa
        System.out.println(str1.indexOf("b")); //5 buldugu ilk dogru eslesmenin indexini dondurur


        System.out.println(str1.indexOf('b',5)); //5
        //5. indexten itibaren aramaya basla
        //(inclusive)

        //verilen String deki 2. a harfinin indexini bul

        int ilkIndex= str1.indexOf('a');//ilk a nin indexi 1
        System.out.println(str1.indexOf('a',ilkIndex+1));
        //+1 in sebebi: ilk bas a karakterinden aratmaya baslicagimiz icin a yi iptal eder yani bi sayi azalir

        String str2="Java bir baska guzel valla cok guzel";
        System.out.println(str2.indexOf("guzel",20));

        System.out.println(str2.indexOf('y'));//y yok demesi lazim ama return type i index
        //yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih eder

        //kullanicidan mail adresini isteyin @ yoksa gecersiz yazdir
        //iceriyorsa mailiniz kabul edildi yaz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazin");
        String mail=scan.next();
        if (mail.indexOf("@")==(-1)){// @ yoksa -1 vericek zaten o yuzden
            System.out.println("gecersiz");
        }else{
            System.out.println("kabul ettim ");
        }
    }
}
