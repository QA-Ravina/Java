public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to merging sorted array\n");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] newArr = mergedArr(arr1, arr2);
        System.out.println("Merged array will be : ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] mergedArr(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] mergedArr = new int[newSize];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length || j < arr2.length){
            if(j == arr2.length || ( i < arr1.length && arr1[i] < arr2[j])) {
                mergedArr[k] = arr1[i];
                k++;
                i++;
            } else {
                mergedArr[k] = arr2[j];
                k++;
                j++;
            }
        }

        return mergedArr;
    }
}
