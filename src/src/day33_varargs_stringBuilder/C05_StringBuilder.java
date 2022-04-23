package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        /*
        Compara iki sb yi esit mi diye kontrol etmek icin ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakterin ASCII tablosuna gore kac deger geride veya ileride oldugunu yazdirir
        Tamamen ayni ise bize 0 dondurur

        bir sb ile bir Stringi compare edersek kabul etmez CTE verir,,compile time error


         */
        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("ali can");

        String str="Ali Can";


        System.out.println(sb1.compareTo(sb2));//-32

        System.out.println(sb1.equals(sb2));//false




    }
}
