import java.util.Scanner;

public class isSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sorting Check post\n");
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

        boolean IncreasingOrder = increasingOrder(arr);
        boolean DecreasingOrder = decreasingOrder(arr);
        if (IncreasingOrder || DecreasingOrder) {
            System.out.println("Your elements are sorted");
        } else {
            System.out.println("Your elements are not sorted");
        }
    }

    public static boolean increasingOrder(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]){
            return false;
        }
        i++;
    } return true;
}

    public static boolean decreasingOrder(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
