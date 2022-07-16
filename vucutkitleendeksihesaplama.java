import java.util.Scanner;

public class vucutkitleendeksihesaplama {
    public static void main(String[] args) {


        double kilo ,boy;
        Scanner input = new Scanner(System.in);

        System.out.println("Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        System.out.println("Boyunuzu Metre Cinsinden Giriniz");
        boy = input.nextDouble();

        double endeks = kilo / (boy * boy);


        System.out.println("Vücut Kitle Endeksiniz : " + endeks);





    }
}


