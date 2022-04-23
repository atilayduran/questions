package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {


        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5); //eski varsa ona dokunmaz

        //bir ekleme yapmak istedigimizde Key daha once eklemmemisse map e eklesin
        // daha onceden eklemnmisse , eskiyi silmemek icin bizi uyarsin


    }
}
