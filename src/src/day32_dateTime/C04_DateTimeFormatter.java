package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/YYYY");
        System.out.println(formatter.format(tarihSaat));//31/3/2022


        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("HH : mm");
        System.out.println(formatterSaat.format(tarihSaat));//21 : 52

    }
}
