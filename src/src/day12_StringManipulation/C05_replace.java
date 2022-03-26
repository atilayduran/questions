package day12_StringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";
        //bu cumlede bosluk disindaki karakter sayisini bulunuz

        System.out.println( "Space haric karakter sayisi : "   +str.replace(" ","").length());

        //atama yapilmadigi surece orjinal string kalici olarak degismez
        //sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur
        System.out.println("orj str karakter sayisi : "+ str.length());

        //str da kalici degisikli yapalim
        //bugun yerine yarin
        //ogrendik yerine ogrenecegiz

        str=str.replace("Bugun","yarin");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalici degisiklikten sonra : "+str);


    }
}
