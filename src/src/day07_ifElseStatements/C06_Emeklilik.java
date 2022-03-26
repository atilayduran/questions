package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        //kullanicidan yasini isteyin
        //65 veya daha buyukse emekli olabilirsin ciksin
        //65 den kucukse emekli olamazsin yarram yazdirin



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas=scan.nextInt();

if (yas>=65) {
    System.out.println("emekli oldun helal");
}else{
    System.out.println("emekli olamazsin salak misin");
    System.out.println(65-yas + " sene daha var");
}
//if else statemenlarda iki durumdan sadece biri calisir
    }
}
