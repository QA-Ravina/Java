package ExceptionHandling;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 2 numbers which you want to divide: ");
        int a = input.nextInt();
        int b = input.nextInt();

        ArithmeticExceptionHandling arm = new ArithmeticExceptionHandling();
        arm.handlingException(a,b);
    }

    void handlingException(int a, int b) {
        try
        {
            int div = a / b;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
