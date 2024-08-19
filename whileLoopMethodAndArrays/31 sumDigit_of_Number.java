import java.util.Scanner;
class sumDigit_of_Number {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        while(n > 0){
            int num = n % 10;
            sum += num;
            n /= 10;
        }
        System.out.print("The sum of the digits of the number is: " + sum);
        input.close();
    }
}
