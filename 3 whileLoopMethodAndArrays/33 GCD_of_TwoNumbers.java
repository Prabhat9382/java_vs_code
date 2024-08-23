import java.util.Scanner;
class GCD_of_TwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        int gcd = gcd(a, b);
        System.out.println("The GCM of " + a + " & " + b + " is " + gcd);
    }
    public static int gcd(int a, int b){
        int ans = 1;
        for(int i = 2; i <= min(a, b); i++){
            if(a % i == 0 && b % i == 0 ) {
                ans = i;
            }
        }
        return ans;
    }
    public static int min(int a, int b){
        if(a < b) {
            return a;
        } else {
            return a;
        }
        //this whole thing can be written as-"return a < b ? a : b;"
    }
}
