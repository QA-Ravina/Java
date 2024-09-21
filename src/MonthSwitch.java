import java.time.Month;
import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month display\n");
        System.out.print("Enter the month number: ");
        int MonthNum = input.nextInt();
        String MonthName = getMonthName(MonthNum);
        System.out.println("The month name is : " + MonthName);

    }

    public static String getMonthName(int MonthNum){
        return switch (MonthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Mars Month";
        };
    }
}
