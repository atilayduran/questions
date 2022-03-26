package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        //verilen bir arrayi listeye cevirin

        String arr[]={"A" , "B", "C"};

        List<String> arraydenList= Arrays.asList(arr);
        //arrayden Liste cevirdigmiz zaman yeni listin uzunlugunu degistiremeyiz
        //dolayisiyla yeni list ile add(), remove(), clear() gibi methodlar calistirmak istedigimizde
        //Java Exception olusur
        //arraydenList.add("J");//unsupportedoperationexception


    }
}
