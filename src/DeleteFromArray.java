import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to deleting an element in an array\n");
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while ( i < size) {
            System.out.print("Enter the element number " + (i+1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Now enter the number which you want to delete: ");
        int numToDelete = input.nextInt();

        int[] newArr = deleteNumber(arr , numToDelete);
        System.out.println("The new array would be: ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] arr, int numToDelete){
        int occ = OccurencesArray.occurenceOfElement(arr, numToDelete);
        int i = 0;
        int j = 0;
        int newsize = arr.length - occ;
        int[] newArr = new int[newsize];

        while ( i < arr.length){
            if (arr[i] != numToDelete){
                newArr[j] = arr[i];
                j++;
            } i++;
        }
        return newArr;
    }
}
