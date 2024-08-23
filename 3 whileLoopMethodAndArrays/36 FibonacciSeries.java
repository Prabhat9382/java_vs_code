import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit number: ");
        int n = input.nextInt();
        System.out.println("The Fibonacci series is: ");
        int i = 1;
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while(i <= n-2){

            int nextNum = a + b;
            System.out.print(nextNum + " ");
            a = b;
            b = nextNum;
            i++;
        }
        input.close();
    }
}
