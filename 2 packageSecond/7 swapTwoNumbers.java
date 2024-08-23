import java.util.Scanner;

class swapTwoNumbers {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.println("a = "+ a +" and b = "+ b);
        System.out.println("After Swapping...");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+ a +" and b = "+ b);
        input.close();
    }
    
}
