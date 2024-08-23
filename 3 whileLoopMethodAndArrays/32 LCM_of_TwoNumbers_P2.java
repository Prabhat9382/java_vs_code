import java.util.Scanner;
class LCM_of_TwoNumbers_P2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        int lcma = lcm(a, b);
        System.out.println("The LCM of " + a + " & " + b + " is " + lcma);
    }
    public static int lcm(int a, int b){
        for(int i = 1; true ; i++){   //i <= b likhle amra jani ek time a factor%b = 0 hobe
            int factor = a * i;  // kintu ota se bujhte pare na....se vabe eta infinite loop
            if(factor % b == 0){  // tai amra "true" use korechi jeta beshi proper
                return factor;
            }
        }
    }
}
