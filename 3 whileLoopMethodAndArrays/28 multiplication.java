import java.util.Scanner;
class multiplication {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Multiplication table of a given number...");
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.println(a + "*" + i + " = " + a*i);
            i++;
        }
        input.close();
    }
}
