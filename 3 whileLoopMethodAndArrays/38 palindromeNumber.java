import java.util.Scanner;
class palindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        int temp = n;
        int ans = 0;
        while(n > 0){
            int num = n%10;
            ans = ans*10 + num;
            n /= 10;
        }
        System.out.println("The reverse of the number is: " + ans);
        if(ans == temp){
            System.out.println("The number is a palindrome number.");
        } else {
            System.out.println("The number is not a palindrome number.");
        }
    }
}
