package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {
        String ogrenciIsmi="Melih";

        ogrenciIsmi="Furkan";

        //bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        //ancak declare edilem bir variable tekrar declare edilemez
     //String ogrenciIsmi="Abdullah";
        //ama stringi silip deger atayabilirsin tekrardan
        ogrenciIsmi="Atysokar27";

        String isim,soyisim,dogumyeri;

        isim="Nihat";
        soyisim="ozel";
        dogumyeri="ankara";

        System.out.println(dogumyeri);

        String tcNo= "123455234";

        // String non-primitive oldugu icin sadece data saklamak degil
        //extra bazi ozelliklerini de kullanabiliyoruz??
        //eger Tcno veya telefon no gibi kendisi sayisal olan ancak matematiksel
        //bir islemde kullanilmayan degerler icin de String kullanilabilir.

        String harf="A";
        char harf2='A';

        //bu ikisi icin de ayni durum gecerli
        // ben A harfi icin bir variable'i char olarak da olusturabilirim
        //String olarak da
        // Eger sadece saklayacaklarsa char olabilir
        //ama String in ozelliklerinden istifade etmek icin String kullanmak daha avantajli olablr.






    }
}
