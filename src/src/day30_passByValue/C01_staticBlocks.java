package day30_passByValue;

public class C01_staticBlocks {

    static {//class calismaya baslamadan once yapmamiz gereken atamalar varsa onlari yapar
        //class ilk calismaya basladiginda devreye girer
        //yazildigi satirin hic bir onemi yoktur
        //class icinde istenen yerde yazilabilir.

        System.out.println("static block1 calisti");
    }
    static{
        System.out.println("statik2 calisti");
    }

    C01_staticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_staticBlocks obj1;
        new C01_staticBlocks();// objeyi cagirdik

    }
}
