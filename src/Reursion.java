import java.util.Scanner;

public class Reursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculation\n");
        System.out.print("Enter the number to perform factorial: ");
        int num = input.nextInt();
//        long factorial = IterativeFactorial(num);
//        System.out.println(factorial);
        long RecursiveFactorial = RecursiveFactorial(num);
        System.out.println(RecursiveFactorial);

    }

    public static long IterativeFactorial(int num ){
        int result = 1;
        for(int i = 1; i <= num ; i++){
            result *= i;
        }
        return result;
    }

    public static long RecursiveFactorial(int num ){

        if( num == 1){
            return 1;
        }
        return num * RecursiveFactorial(num-1);
    }
}
