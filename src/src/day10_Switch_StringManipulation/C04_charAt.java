package day10_Switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        // String de herhangi bir karakteri almak istedgimizde
        //o harfin indexini kullanarak
        //str.charAt(istenenindex) yazdirabiliriz

        String str= "Java cok guzel";

        System.out.println(str.charAt(0));//J

        //va yazdiralim

        System.out.println(str.charAt(2)+""+str.charAt(3));

        //cOK seklinde yazdir
        System.out.println(str.toLowerCase().charAt(5)+""+ str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));
        ;
        //son harfi yazdir
        // String de 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1));

    }
}
