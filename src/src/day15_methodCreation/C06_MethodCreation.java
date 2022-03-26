package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //iki variable degerini toplayan method olusturalim
        //1.adim method adini yaz
        //2.adim methoda gondermem gerek arguman var mi?

        ikiSayiTopla(a,b);
ikiSayiTopla(25,50);
        C04_depo.dortHarfiTersineCevir("sema");

    }
//bir methodu olusturmak calismasi icin yeterli degildir
    //method ancak cagirilirsa calisir
    //ayni class veya farkli classda olmasinin hic bi onemi yok
    //java main methodda yukaridan asagi calisir
    //ve geldigi satiri calistirir
    public static void ikiSayiTopla(int a, int b) {
        System.out.println("Verilen iki sayinin toplami :"+ (a+b));
    }
}
