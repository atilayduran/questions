package day12_StringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        String email="mulkiyeayboy@gmail.com";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen email adresi gir");

        }else if (email.endsWith(arananMetin)){
            System.out.println("mail kaydoldu gulum");

        }else{
            System.out.println("sie oc");
        }


    }
}
