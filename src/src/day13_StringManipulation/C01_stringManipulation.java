package day13_StringManipulation;

public class C01_stringManipulation {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));//i den sonra ne varsa yazdircak
// yukardaki String i Mehmet hoca ile IT cok guzel

        System.out.println(str.replaceAll("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca "+str.substring(5));

        //eger bir indexten sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekir
        // str.substring(baslangicIndexi, bitisIndexi)
        //baslangic indexi => inclusive/dahil
        //bitis indexi ==> exclusive/haric

        System.out.println(str.substring(0,5));//Java bosluk dahil

        String harf=str.substring(5,6);//6. harfi string olarak bul// charAt ile alabilirdin ama String olmazdi

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7));//hiclik verir soldan saga okuma yapildigi icin

        //System.out.println(str.substring(5,2));//bitis indexi baslangic indexinden kcuk olamaz

        System.out.println(str.substring(str.length()-1));//son harf verir
        System.out.println(str.substring(str.length()-5));//son5 harfi yazdir
        System.out.println(str.substring(str.length()));//son harften sonraki kismi yani hiclik verir.


    }

}
