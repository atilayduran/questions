package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate trh = LocalDate.now(); //objenin olusturuldugu tarihi trh'ye atar
        LocalDate baskaTrh=LocalDate.of(1995,7,27);
        //istedigimiz yil,ay ve gun degerlerine gore bize obje olusturur
//get li methodlarla tarih ile ilgili detay bilgilerini alabilriz
        System.out.println(trh);//2022-03-31

        System.out.println(trh.getDayOfMonth());//31
        System.out.println(trh.getDayOfWeek());//THURSDAY
//bir tarihten istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20));//2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3));//2022-02-21


        //istedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);



    }
}
