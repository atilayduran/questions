package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        //10 elementli bir list olustr

        int arr[]={2,5,4,6,4,9,7,1,3,10};

        List<Integer> sayilar = new ArrayList<>();

        for (int each: arr
             ) {
            sayilar.add(each);
        }
        System.out.println(sayilar);//[2, 5, 4, 6, 4, 9, 7, 1, 3, 10]


        // sayilar listesinden 3 bolunmeyen sayilari foreach ile yazdir
        for (int each:sayilar
             ) {
            if (each%3!=0){
                System.out.println(each+" ");


            }

        }
    }
}
