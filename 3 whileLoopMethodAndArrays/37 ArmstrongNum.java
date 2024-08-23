import java.util.Scanner;
class ArmstrongNum {
    public static void main(String[] args){
        System.out.println("Check if the number is an Armstrong number or not...");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int temp = n; // store the original number as later the value n will change in the while loop
        int p = power(n);
        int sum = 0;
        while(n > 0){
            int digit = n%10;
            sum += Math.pow(digit, p);
            n /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
        if(sum == temp){
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
        input.close();
    }
    public static int power(int x){
        int count = 0;
        while(x > 0){
            count++;
            x /= 10;
        }
        return count;
    }
}
