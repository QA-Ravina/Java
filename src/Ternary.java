import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int greatest = greatestNum(num1 , num2);
        System.out.println("The greatest number is " + greatest);
    }

    //normal way
//    static int greatestNum(int num1, int num2){
//        int greatestNum;
//        if(num1 > num2 ){
//            greatestNum = num1;
//        } else {
//            greatestNum = num2;
//        }
//        return greatestNum;
//    }

    //Ternary way
    static int greatestNum(int num1, int num2){
        int greatestNum = num1 > num2 ? num1 : num2;
        return greatestNum;
    }
}
