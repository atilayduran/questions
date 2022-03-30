package day28_staticKeyword;

public class C01_Static {

    String okulIsmi="Yildiz Koleji";
    static String okulTelefonu="31234123";


    public static void statikMethod(){

        System.out.println("statik method calisti");
    }

    public void staticOlmayanMethod(){
        System.out.println("Statik olmayan method");

    }

}
