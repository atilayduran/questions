package day28_staticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {

        //baska classtaki static class uyelerine
        //ulasabilmek icin sadece classIsmi.statikUyeismi yazmamiz yeterlidir

        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu="12312313";
        System.out.println(C01_Static.okulTelefonu);
    //baska class daki statik olmayan class uyelerine
        //ancak o classdan obje olusturarak ulasabilirz
        //ve obje ile yapilan atamalar sadece o obje icin gecerli olur

        C01_Static obj1= new C01_Static();
        C01_Static obj2= new C01_Static();

        System.out.println(obj2.okulIsmi);//Yildiz Koleji
        obj2.okulIsmi="Sabir Koleji";
        System.out.println(obj1.okulIsmi);//Yildiz koleji
        System.out.println(obj2.okulIsmi);//Sabir koleji



    }
}
