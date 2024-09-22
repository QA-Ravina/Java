public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++){
            if(i == 101){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("out of the loop");

       // 5 will not get printed here due to continue statement it will directly go to the update of loop without executing print statement

        for (int j = 1; j < 10; j++){
            if(j == 5){
                continue;
            }
            System.out.println(j);
        }
        System.out.println("out of the loop");
    }
}
