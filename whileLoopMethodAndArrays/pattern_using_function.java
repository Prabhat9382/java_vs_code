import java.util.Scanner;
public class pattern_using_function {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Calculate the sum...");
        int a = readNum();
        int b = readNum();
        input.close();                   
        System.out.print("The sum is " + sum(a, b));
    }
    public static int readNum(){
        
        System.out.print("Enter a number: ");
        return input.nextInt();
        
    }
    public static int sum(int m, int n){
        return m+n;
    }
    
}
