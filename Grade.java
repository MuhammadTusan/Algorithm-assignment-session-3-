import java.util.Scanner;

public class Grade  {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter your score");
        Double grade = scanner.nextDouble();

        if (grade >=70 && grade <=100){
            System.out.println("You passed");
        }else if (grade <=70 && grade >=0){
            System.out.println("You failed");
        }else{
            System.out.println("You put invalid number, only accept 0-100");
        }
        scanner.close();
    }
}
