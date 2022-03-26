package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {



        //stringi yazdiran method olusturalim
        //hosgeldiniz diyen bi method olustur
        //kapanma mesaji
        hosgeldinYazdir();
        stringYazdir("Java guzellesiyooo");
        kapanmaMethodu();


    }

    public static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tsk");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
    }

    public static void stringYazdir(String str) {
        System.out.println(str);
    }
}
