package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {
        int sayi1=10;
                int sayi2=20;

        ikiSayiToplam(sayi1, sayi2);


        // double icin yap

        double sayi3=15.2;
        double sayi4=10.3;

        ikiSayiToplam(sayi3, sayi4);

        ikiSayiToplam(sayi1,sayi4);







    }

    private static void ikiSayiToplam(double sayi3, double sayi4) {
        System.out.println("iki double toplam : "+ (sayi3+sayi4));
    }

    private static void ikiSayiToplam(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : " + (sayi1+sayi2));
    }


    private static void ikiSayiToplam(int sayi3, double sayi4) {
        System.out.println("bir int bir double toplam : "+ (sayi3+sayi4));
    }
}
