import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even calculation\n");
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        OddEvenTernary OddEven = new OddEvenTernary();
        boolean isEven = OddEven.isEven(number);
        if(isEven == true){
            System.out.println("Its an even number");
        } else {
            System.out.println("Its an odd number");
        }

    }

    boolean isEven(int number){
        return number % 2 == 0 ? true : false;
    }
}
