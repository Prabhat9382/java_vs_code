import java.util.Scanner;
class reverseDigits_in_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        int ans = 0;
        while(n > 0){
            int num = n%10;
            ans = ans*10 + num;
            n /= 10;
        }
        System.out.println("The reverse of the number is: " + ans);
    }
}
