import java.util.Scanner;

public class OccurencesArray {
    public static void main(String[] args) {
        System.out.println("Welcome to calculation of number of occurences of an element in an array\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();

        int[] arr = new int[size]; //declaration of an array
        int i = 0;
        while (i < size) {
            System.out.print("Enter the Element number " + (i+1) + " : ");
             arr[i] = input.nextInt();
            i++;
        }

        System.out.print("Please enter the number for which you want to check occurences: ");
        int num = input.nextInt();
        int Occurences = occurenceOfElement( arr , num);
        System.out.println("The number " + num + " is occuring " + Occurences + " times");
    }

    public static int occurenceOfElement(int[] arr, int num){
        int occ = 0;
        int i = 0;
        while (i < arr.length){
            if ( arr [i] == num) {
                occ++;
            } i++;
        }
        return occ;
    }
}
