package day12_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
                /*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        - Girilen kelime cumlede kullanilmamis.
                - Girilen kelime cumlede 1 kere kullanilmis.
        - Girilen kelime cumlede 1’den fazla kullanilmis.*/

        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";


        int ilkKullanim= cumle.indexOf(kelime);
// -1 veya index
        int sonKullanim=cumle.lastIndexOf(kelime);
        if(ilkKullanim==(-1)){
            System.out.println("kullanilmamiss");
        }else if (ilkKullanim==sonKullanim){
            System.out.println("girilen kelime bir kez kullanilmis");

        }else{
            System.out.println("birden fazla kullanilmis");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));//4 dahil p den itibaren
    }
}
