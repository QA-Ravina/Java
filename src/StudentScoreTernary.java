import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Score calculation of student\n");
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        String result = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("You are under "+ result + " category");
    }


}
