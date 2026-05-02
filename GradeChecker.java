import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student score (0–100): ");
        int score = input.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("Excellent");
        } 
        else if (score >= 60) {
            System.out.println("Good");
        } 
        else if (score >= 50) {
            System.out.println("Pass");
        } 
        else if (score >= 0) {
            System.out.println("Fail");
        } 
        else {
            System.out.println("Invalid score!");
        }

        input.close();
    }
}
