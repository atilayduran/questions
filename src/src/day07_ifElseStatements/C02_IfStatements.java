package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a<b && b<100) {
            System.out.println("isleminiz gerceklesecek");
            //sart dogru olursa body ici tum kodlar calisir
            if (a>0) System.out.println("suslu parantez olmazsa sadece bir satir calisir");

            System.out.println("2.satir calisti");
        //bir if statement inin daha anlasilir olmasini istiyorsaniz {} kullan
            //if bodysi {} icine yazilmali
            //body yi{} icine yazmasak da calisir
            //ancak ilk ; gordugunde if cumlesi biter.
        }
    }
}
