import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
       String[] array = new String[] {
               "Ram" , "shyam", "Mohan", "Geeta", "Sita", "Rita"
       };

       printArray(array);
       printArrayForEach(array);
    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }


    public static void printArrayForEach(String[] array){
        for (String name : array){
            System.out.println(name);
        }
    }
}
