import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculation of Absolute number");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        AbsoluteTernary Abs = new AbsoluteTernary();
        int AbsoluteNumber = Abs.absolute(num);
        System.out.println("The absolute number is : " + AbsoluteNumber);

    }

    int absolute(int num){
         int result = num >= 0 ? num : -num;
         return result;
    }
}
