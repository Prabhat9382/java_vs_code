public class pattern_using_loop {

    public static void main(String[] args){

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int k = 1; k <= 5; k++){
            for(int l = 1; l <= 5-k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
