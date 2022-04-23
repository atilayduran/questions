package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {


        LocalTime tm= LocalTime.now();
        System.out.println(tm); //21:11:17.957229100
//bir islemin ne kadar surede bittigini bulmak istersek
        //islemden once ve sonra birer time objesi olusuturup
        //aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;


        }//araya for koydum sonra ayni islemi yaptim islemleri ayni saniyede yapcak mi diye
        System.out.println(tm);//21:11:17.957229100
        //ayni cunku ayni elemanlar

        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);//21:15:03.887937100

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem " + (nano2-nano1)+" nano saniyede bitti");


        //ileri veya geri gidebilirz
        System.out.println(tm.plusMinutes(1000));

        //istersek zone id kullanarak istedgimiz bolgenin saati icin de obje olusturabilirz
    }


}
