package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primitive data turu ile nonprimitive arasindaki farklar nelerdir?
        String str="Java";
        int sayi=10;
        System.out.println(str.toUpperCase());//JAVA
        //non primitive data turleri data depolamak yaninda bir cok faydali methoda sahiptir
        //ancak primitive data turlerinin bole bi ozelligi yohtur
        //primitive data turleri sadece degerleri saklarlar

        //primitive data turleri icin de vazi methodlar gerekli oldugunda
        //Java bir cozum uretmistir
        //java her bir primitive data turu icin bir de nonprimitive olarak kullanabilmek icin
        //ozel classlar olusturmus ve bunlara Wrapper Class adini vermistir

        double sayi2=20.5;

        //sayi2 primitive oldugundan sayi2. dedigimizde hicbisi gelmez

        Double sayi3= 15.2;

        //sayi3 wrapper class olan double class kullandigindan
        //sayi3. dedigimizde bircok method gelir
    }
}
