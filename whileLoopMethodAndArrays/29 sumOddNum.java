import java.util.Scanner;
class sumOddNum {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Sum of odd numbers between 1 and n...");
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n){
            sum += oddNum(i);
            i++;
        }
        System.out.println("The sum of odd numbers between 1 and " + n + " is " + sum);
        input.close();
    }
    public static int oddNum(int x){
        if(x % 2 != 0){
            return x;
        } else { // jodi even number hoy, then kichu ekta return kortei hobe, karon function er return type int,tai e "else"
            return 0;
        }
    }
}
