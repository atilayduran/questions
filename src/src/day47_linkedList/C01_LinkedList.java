package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        //linkedlistin 2 tane parent interface i vardir
        //linkedlist olustururken data turu olarak;
        //linkedlist secersek: iki parenttaki tum methodlar kullanilabilir
        //list secersek: sadece list interface indeki methodlar
        //Deque/Queue secersek deque daki methodlari kullanabiliriz

        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10);//linkedlist

        //sadece list interface inden ozellikler kullanmak istersek

        List<Integer> ll2=new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);

        //sadece Deque den gelen ozellikleri kullanalim
        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);
    }
}
