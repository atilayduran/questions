package day10_Switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
//concatenation yapmak icin iki ihtimalimiz var
        //istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        //veya String classindan gelen concat methodunu kullanabilirz

        String str1= "Java";
        String str2="Candir";
        //Java Candir yazdir

        System.out.println(str1+" "+ str2);

        String cumle=str1.concat(str2);

        cumle= str1.concat(" ").concat(str2);
        System.out.println(cumle);
//concat icine String degil de sayi veya boolean yazinca nolur
        //cumle=str1.concat(5); olmaz
        //concat methodu icine String parametre ister
        //String disi data turu yazarsaniz onu Stringe cevrmeniz gerek

        cumle=str1.concat(""+5);

    }
}
