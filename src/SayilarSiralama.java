import java.util.Scanner;

public class SayilarSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("1. Sayıyı Giriniz : ");
        a = input.nextInt();

        System.out.println("2. Sayıyı Giriniz : ");
        b = input.nextInt();

        System.out.println("3. Sayıyı Giriniz : ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("A < B < C ");
            } else {
                System.out.println("A < C < B ");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("B < A < C ");
            } else {
                System.out.println("B < C < A");
            }

        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("C < A < B");
            }else {
                System.out.println("C < B < A");
            }


        }
    }
}
