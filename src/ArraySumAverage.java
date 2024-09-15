import java.util.Scanner;

public class ArraySumAverage {

    //Create a program to find the sum and average of all the elements in an array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array sum and average\n");
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Please enter the Element " + (i+1) + ": " );
            arr[i] = input.nextInt();
            i++;
        }

        long Sum = sum(arr);
        System.out.println("Sum of the element is : " + Sum);
        double average = average(arr);
        System.out.println("The average of the element is: " + average);


    }

    public static long sum(int[] arr) {
        int sum = 0;
        int j = 0;
        while ( j < arr.length){
            sum += arr[j];
            j++;
        }
        return sum;
    }

    public static double average(int[] arr){
        double sum = sum(arr);
        return  sum/arr.length;
    }
}
