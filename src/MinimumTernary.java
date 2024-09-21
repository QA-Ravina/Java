import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculation of minimum number\n");
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        MinimumTernary minimum = new MinimumTernary();
        int Minimum = minimum.minTer(num1, num2);
        System.out.println("The minimum umber is " + Minimum);


    }

    int minTer(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }
}
