package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class HW_sayiBulmaca {
    //bilgisayara 1-100 arasinda bir sayi tuttur
    //kullanicidan bu sayiyi tahmin etmesini iste
    //girilen her tahminde sayiyi buyut vveya kucult diye yol goster
    //kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdir
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();

        int tahminSayisi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        int kontrol=0;

        while(true){
            System.out.println("lutfen tahmin sayisi giriniz");
            int sayi=scan.nextInt();

            if(sayi<tahminSayisi){
                System.out.println("tahmin hatali,artirin biraz");
                kontrol++;
            } else if(tahminSayisi<sayi){
                System.out.println("tahmin hatali,azaltiniz");
                kontrol++;
            }else if(sayi==tahminSayisi){
                System.out.println("Tahmin dogru girilmistir");

                kontrol++;
                System.out.println(kontrol+"kez tahmin ettiniz");
                break;
            }

        }
    }
}
