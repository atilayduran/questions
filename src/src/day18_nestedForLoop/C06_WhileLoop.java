package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan iki tam sayi alip
        //bu sayilari ver aralarindaki tum tam sayilari yazdiran bir kod olustur
int baslangic=40;
int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");

        //ayni soruyu while loop ile yapalim




        int i= baslangic;
        while (baslangic <=bitis){

            System.out.print(i +" ");
            i++;
        }
        System.out.println("");


    }
}
