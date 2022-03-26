package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1= 879;
        double sayi2=10;


        double sayi3=sayi1/sayi2;
        //87.9

        System.out.println(sayi3);

        int sayi4= (int)(sayi1/sayi2); //BU HATA -- deger double, variable int
        //yani variable daha dar dolayisiyla java bunu oto yapmaz
        //sorumlulugu ustlenmemizi ister
        //sag tarafa yazdigimiz (int) sorumluluk bende demek
//87 verir kusurat vermez
        System.out.println(sayi4);

        int sayi5=140;
        byte sayi6=(byte)sayi5; //sag taraftaki int, sol taraftaki byte tan buyuk o yuzden kabul olmaz
        System.out.println(sayi6);
    }
}
