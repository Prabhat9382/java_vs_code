import java.util.Scanner;
class factorial {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Factorial of a number...");
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        long  fact = factorialNum(n);
        System.out.println("The factorial of " + n + " is " + fact);
        input.close();
    }
    public static long factorialNum(int x){
        if(x < 2){
            return 1;
        }
        int num = x;
        for(int i = x-1; i >= 1; i--){
            num *= i;
        }
        return num;
    }
}
