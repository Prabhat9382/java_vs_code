import java.util.Scanner;
class LCM_of_TwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int n = input.nextInt();
        int m = input.nextInt();
        boolean found = false; //in JAVA, local variables must be initialized before use
        for(int i = 1; i <= n*m; i++){
            for(int j = 1; j <= n*m; j++){
                if(n*j == m*i){
                    System.out.print("The LCM of "+n+" & "+m+" is "+ n*j);
                    found = true;
                    break;
                }
            }
            if(found == true){
                break;
            }
        }
        input.close();
    }
}
