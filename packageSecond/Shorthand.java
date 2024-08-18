import java.util.Scanner;
public class Shorthand {
    public static void main(String[] args){
        int a = 5;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(x);
        a += x;
        System.out.println("a+x =" + a);
        input.close();
    }
    
}
