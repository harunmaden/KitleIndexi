import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kilo;
        double boy,index;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextInt();
        index = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndexsiniz : " + index);
    }
}