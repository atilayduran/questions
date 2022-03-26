package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {

        int sayi=20;
sayi=sayi+10; //30
        System.out.println(sayi=sayi+10); //40
        //sayi 40 a esit oldu
        System.out.println(sayi+=10); //50
        System.out.println(sayi); //50

//bir variable in degerini kalici olarak arttirmak veya azaltmak isterseniz assignment sart
        System.out.println(sayi++); //50
        System.out.println(sayi);  //51

        System.out.println(++sayi);
        System.out.println(sayi);
    }
}
