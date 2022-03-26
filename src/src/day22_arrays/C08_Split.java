package day22_arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {
        //verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        //bir method olustur
        String cumle="Nerede o hello world yazdiramayan ogrenciler?";
        String harf="e";

        harfKacKereKullanilmis(cumle,harf);
    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {

        int sayac=0;
        String karakterler[]=cumle.split("");
        for (int i = 0; i <karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;
            }




        }
        System.out.println(Arrays.toString(karakterler));
        System.out.println("aradiginiz "+harf+" verilen cumlede "+ sayac + " adet kullanilmistir");
    }
}
