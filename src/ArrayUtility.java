import java.util.Scanner;

public class ArrayUtility {
   public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter the element number " + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
    }
}
