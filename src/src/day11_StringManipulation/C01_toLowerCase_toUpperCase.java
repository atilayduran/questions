package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str= "Java guzeldir";

        //Biz string methodlarini arka arkaya kullanabilirz
        //mesela ikinci kelimenin ilk g harfini kucuk olarak yazdiralim


        //str.charAt(5); bole yazinca sonuc artik String deil char olcaktir
        //dolayisiyla Stringde yapmak istedigimiz tum degisiklikleri once yapip
        //sonra charAt() methodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
    }
}
