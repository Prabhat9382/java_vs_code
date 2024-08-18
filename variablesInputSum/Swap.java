public class Swap {
    public static void main(String[] args){

        String x = "Ram";
        String y = "Lakshman";
        String temp;
        
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
