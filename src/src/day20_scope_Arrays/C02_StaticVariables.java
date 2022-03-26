package day20_scope_Arrays;

public class C02_StaticVariables {

    //instance variable lar objeye baglidir ve her obje farkli deger alabilir
    //ogrenci notlari veya ogretnemen baslari gibi
    //bir objeye ait bir variable in son degerini bulmak icin sadece o objeyi dikkate aliriz


    //Static variable lar ise class variable olarak tanimlanir
    //ve tum class uyeleri icin aynidir. okul ismi, okul mudurunun adi gibi
    //eger statik variable degeri degistirilrse herkes icin degisir

static String okulIsmi="Yildiz Koleji";
static int okulNo;
static boolean okulAcikMi;
//bu kisim class level

    public static void main(String[] args) {

        System.out.println(okulIsmi);// yildiz kol
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);//false cunku deger yok

staticMethod();
    }

    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);//200
// yazdirmaz cunku cagirilmasi lazim yukarda
    }
}
