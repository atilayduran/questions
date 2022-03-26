package day14_StringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        // Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        //        yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234*/

        String isim="oguzhan";
        String soyisim="BALKAYA";
        String kkNo= "1234567892231234";

        String yeniIsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyIsim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yenikkNo= "**** **** **** "+ kkNo.substring(12);

        System.out.println("isim soyisim "+yeniIsim+" "+yeniSoyIsim+"\nkartno "+ yenikkNo );

    }
}
