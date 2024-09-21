import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the day identifier\n");
        System.out.print("Enter the day number, from 1 to 7: ");
        int Num = input.nextInt();
       // oldSwitch(Num);
        newSwitch(Num);
    }

    public static void oldSwitch(int Num){
         switch (Num) {
             case 1 :
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("Tuesday");
                 break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;

//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//
             case 6: // This is called fall through
             case 7:

                 System.out.println("holiday");
                 break;

             default:
                 System.out.println("Invalid day");
                 break;

        }
    }

    public static void newSwitch( int Num){

        String StrDay = switch (Num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

        System.out.println(StrDay);
    }
}
