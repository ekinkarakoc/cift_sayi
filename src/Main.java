import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}