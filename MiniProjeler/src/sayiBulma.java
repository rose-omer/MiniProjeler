import java.util.Scanner;

public class sayiBulma {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int [] sayilar = new int[]{1,2,3,4,5,6,7,8,9,0};
        int aranacak =2;
        boolean varMi =false;
        for (int sayı : sayilar) {
            if (sayı ==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı mevcuttur");
        }
        else {
            System.out.println("Sayı mevcut değildir ");
        }


    }
}
