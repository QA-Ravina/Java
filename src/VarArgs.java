public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(8,9,29,292,92));
    }

    public static int sum (int a, int ...b){
        int sum = 0;
        for (int i : b){
            sum +=i;
        }
        return sum;

    }
}
