package day17_forLoop;

public class C04_forLoop {
    public static void main(String[] args) {

        //10 ile 30 arasi sayilari 10 30 dahil yazdir
        //aralarina virgul koy

        for (int i = 10; i<=30 ; i++) {
            System.out.print(i+", ");

            int baslangic=10;
            int bitis=30;
            for (int j =baslangic; j <=bitis ; j++) {
                if (j<bitis){
                    System.out.println(j+", ");
                }else{
                    System.out.println(j);
                }

            }

        }
    }
}
