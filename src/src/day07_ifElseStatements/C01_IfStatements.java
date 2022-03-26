package day07_ifElseStatements;

public class C01_IfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a == b) {
            //a int oldugu icin(boolean istiyor) == koyuyoz

            System.out.println("verilen sayilar esit aq sala");
            //bisi cikmicak cunku false
        }
        if (a > 100) {
            //calismicak
        }

        if (a * b > 5) {
            System.out.println("sayilarin carpimi 5 ten buyuk");
        }
//bagimsiz if cumleleri kendi disindaki kodlarla ilgilenmezler
        //`bir sart ve o sarta bagli sonuca odaklidir
        //birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
        //hicbrinin body si calismayabilir

    }
}
