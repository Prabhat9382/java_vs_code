import java.util.Scanner;
public class bitwise_operators {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("Choose your bitwise operator: ");
        String operator = input.next();
        switch(operator){
            case "AND": System.out.println("Bitwise AND: " + (a & b));
                break;
            case "OR": System.out.println("Bitwise OR: " + (a | b));
                break;
            case "XOR": System.out.println("Bitwise XOR: " + (a ^ b));
                break;
            case "compliment"/*NOT*/: System.out.println("Bitwise compliment: " + (~ a));
                    System.out.println("Bitwise compliment: " + (~ b));
                break;
            case "leftShift": System.out.println("Bitwise left shift: " + (a << 1));
                    System.out.println("Bitwise left shift: " + (b << 1));
                break;
            case "rightShift": System.out.println("Bitwise right shift: " + (a >> 1));
                    System.out.println("Bitwise right shift: " + (b >> 1));
                break;
            default: System.out.println("Invalid operator");
        }
        input.close();
    }
    
}
