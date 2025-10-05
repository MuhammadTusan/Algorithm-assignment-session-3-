import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan durasi running (menit): ");
        int runningMinutes = input.nextInt();

        System.out.print("Masukkan durasi push-ups (menit): ");
        int pushupMinutes = input.nextInt();

        System.out.print("Masukkan durasi planks (menit): ");
        int plankMinutes = input.nextInt();

        double runningCalories = (60.0 / 5) * runningMinutes;     
        double pushupCalories = (200.0 / 30) * pushupMinutes; 
        double plankCalories = 5.0 * plankMinutes;               
        double totalCalories = runningCalories + pushupCalories + plankCalories;

        System.out.println("\n=== Hasil Perhitungan Kalori ===");
        System.out.println("Running: " + runningCalories + " kalori");
        System.out.println("Push-ups: " + pushupCalories + " kalori");
        System.out.println("Planks: " + plankCalories + " kalori");
        System.out.println("Total Kalori Terbakar: " + totalCalories + " kalori");

        input.close();
    }
}
