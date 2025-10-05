import java.util.Scanner;

public class GradeClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai (0-100): ");
        int grade = scanner.nextInt();

        if (grade >= 80 && grade <= 100) {
            System.out.println("Grade: A");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Grade: B");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Grade: C");
        } else if (grade >= 50 && grade <= 59) {
            System.out.println("Grade: D");
        } else if (grade >= 0 && grade <= 49) {
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}
