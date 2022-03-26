package day12_StringManipulation;

import java.util.Scanner;

public class C01_indexOf {
    public static void main(String[] args) {
        /*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        - Girilen kelime cumlede kullanilmamis.
                - Girilen kelime cumlede 1 kere kullanilmis.
        - Girilen kelime cumlede 1’den fazla kullanilmis.*/

String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
//String kelime="yeni";
        Scanner scan=new Scanner(System.in);
        System.out.println("ne arayacagini gir");
        String kelime= scan.next();


int ilkKullanim= cumle.indexOf(kelime);
// -1 veya index
int ikinciKullanim= cumle.indexOf(kelime, ilkKullanim+1);
        if(ilkKullanim==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis");


        }else if (ikinciKullanim==-1){
        System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
    }else
    {
        System.out.println("girilen kelime birden fazla kez kullanilmis");

    }}
}
