package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {

        //1-Farkli 3 data turunde variable olustur ve yazdir

        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='K';
        System.out.println(ilkHarf); // K

        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2); //30

//2-isim ve soyisim icin iki variable olusturun
        //isminiz : mahmut
        //soyisminiz: bulut

        String isim="Nezir";
        String soyisim="Yildiz";

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz: " + soyisim);

        //3- iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        short sayi3=20;
        double sayi4=30;

        System.out.println("Iki sayinin toplami ; " +(sayi3+sayi4));

        //5-char data turunde bir variable olusturun ve yazdirin

        char ozelKarakter='#';
        System.out.println(ozelKarakter);

        //6-bir tamsayi' bir de char degisken olusuturn ve bunlarin toplamini yazdirin

        int sayi5=20;
        char harf='a';

        System.out.println(sayi5+harf); //117
        //char data turundeki degiskenler matematiksel islemlerde kullanilirsa
        //o char degerinin ASCII karsiligi isleme alinir

//


    }


}
