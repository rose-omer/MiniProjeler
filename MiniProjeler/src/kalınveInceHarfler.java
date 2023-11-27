import java.sql.SQLOutput;
import java.util.Scanner;

public class kalınveInceHarfler {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char[] kalın = {'A', 'I', 'U', 'O'};
        char[] ince = {'E', 'İ', 'Ü', 'Ö'};
        System.out.println("Kontrol etmek istediğiniz sesli harfi giriniz ");
        System.out.println("A,I,U,O,E,İ,Ü,Ö");
        String harf = inp.next();
        System.out.println(harf.charAt(0));
        for (int i = 0; i < 3; i++) {
            if (kalın[i] == harf.charAt(0)) {
                System.out.println(" Kalın harflidir==>" + kalın[i]);
            }
            if (ince[i] == harf.charAt(0)) {
                System.out.println("İnce harflidir==>" + ince[i]);
            }
        }
    }
}
