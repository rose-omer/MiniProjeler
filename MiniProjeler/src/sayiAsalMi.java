import java.util.Scanner;
/*
öncelikle sayı aldık sonra kontroldü tanımladık
sonra sayı'nın modunu alarak kontrol ettik
sayı asalsa kontroldü 0
asal değil ise kontrolcü 1 olucak sekilde
ayrım yaptık ve yazdırdık
 */
public class sayiAsalMi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Asal sayımı diye kontrol etmek istediğiniz sayıyı giriniz ==> ");
        int sayi = inp.nextInt();
        int kontrolcu=0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i ==0 ){
                kontrolcu++;
            }
        }
        if (kontrolcu ==0 ){
            System.out.println("Sayı asaladır =>"+sayi);
        }else {
            System.out.println("Sayı asal değildir =>"+sayi);
        }
    }
}

