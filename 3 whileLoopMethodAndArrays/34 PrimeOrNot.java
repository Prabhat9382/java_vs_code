import java.util.Scanner;
class PrimeOrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if(isPrime(n)){
            System.out.println("The number is a prime number.");
        } else {
            System.out.println("The number is not a prime number.");
        }
        input.close();
    }
    public static boolean isPrime(int n){
        if(n == 1 || n == 2 || n == 3){
            return true;
        } else {
            for(int i = 2; i <= n-1; i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
