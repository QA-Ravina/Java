import java.util.Scanner;

public class DoWhile {

    //print an age and if the age is invalid ask again using d while loop
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //while loop
//        while (age < 0 || age > 100){
//            System.out.print("Please enter your age: ");
//             age = input.nextInt();
//        }

        // do while loop
        int age;
        do {
            System.out.print("Please enter your age: ");
             age = input.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Your age is : " + age);
    }
}
