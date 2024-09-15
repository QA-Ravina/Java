public class ArrPalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator of Array Palindrome\n");
        int[] Arr = ArrayUtility.inputArray();
        boolean isArrPalindrome = isArrPalindrome(Arr);
        if(isArrPalindrome) {
            System.out.println("Yes, the array is a palindrome");
        } else {
            System.out.println("No, the array is not a palindrome");
        }
    }

    public static boolean isArrPalindrome(int[] Arr){
        int i = 0;
        while (i < Arr.length/2){
            if(Arr[i] != Arr[(Arr.length-1) - i]){
                return false;
            } i++;
        }
        return true;
    }
}
