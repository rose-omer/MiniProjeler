import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        //6 --> 1,2,3         1+2+3 =6
        //28 -- 1,2,4,7,14    14+7+4+2+1= 28
        Scanner inp =new Scanner(System.in);
        int [] bolenler =new int[20];
        int toplam =0;
        int index =0;

        System.out.print("Mükemmel sayımı diye kontrol etmek istediğiniz sayıyı girin ==> ");
        int sayi = inp.nextInt();
        for (int i = 1; i <sayi; i++) {
            if (sayi%i==0){
                bolenler[index]= i;
                index++;
            }
        }
        for (int i = 0; i <bolenler.length ; i++) {
              toplam+=bolenler[i];
        }

        if (toplam==sayi){
            System.out.println("Sayı mükemmeldir");
        }
        else{
            System.out.println("Sayı mükemmel sayı değildir");
        }
    }
}