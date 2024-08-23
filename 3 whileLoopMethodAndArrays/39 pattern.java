import java.util.Scanner;
class pattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();
        input.close();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int k = 1; k <= n; k++){
            for(int j = 1; j <= n+1-k; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int l = 1; l <= n; l++){
            for(int s = 1; s <= n-l; s++){
                System.out.print("  ");
            }
            for(int j = 1; j <= l; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
