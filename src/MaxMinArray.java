import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Min and Max calculator of an array\n");
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the element number " + (i+1) + " : " );
            arr[i] = input.nextInt();
            i++;
        }

        int Max = max(arr);
        System.out.println("The maximum number in the array: " + Max);
        int Min = min(arr);
        System.out.println("The minimum number in the array: " + Min);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        int i = 1;
        while( i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            } i++;
        }
        return max;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length){
            if (min > arr[i]) {
                min = arr[i];
            } i++;
        }

        return min;
    }
}
