import java.util.Scanner;

public class FindTheLargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = sc.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = sc.nextInt();

        System.out.print("Masukkan nilai c: ");
        int c = sc.nextInt();

        int largest = a;
        String variable = "a";

        if (b > largest) {
            largest = b;
            variable = "b";
        }
        if (c > largest) {
            largest = c;
            variable = "c";
        }
        System.out.println("The largest number is " + variable + " = " + largest);

        sc.close();
    }
}
