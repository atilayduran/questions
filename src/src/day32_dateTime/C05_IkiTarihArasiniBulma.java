package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1995,07,27);

        System.out.println(Period.between(dogumGunu,bugun));//P26Y8M4D //p:periyod 26yil 8ay 4 gun

        System.out.println(Period.between(dogumGunu,bugun).getYears());
    }
}
//
