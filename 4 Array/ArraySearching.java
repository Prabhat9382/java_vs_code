import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = {2,5,1,7,3,9,4,6,8};
        System.out.print("Enter the number to search: ");
        int n = input.nextInt();
        input.close();
        boolean isFound =isFound(arr, n);
        if(isFound){
            System.out.println("Number is found");
        }else{
            System.out.println("Number is not found");
        }

        String[] strArr = new String[5];
        strArr[0] = "Hello";

        String[] newstrArr = {"Hello", "World", "Java", "Python", "C++"};
        System.out.println(newstrArr.length);
    }
    public static boolean isFound(int[] arr, int n){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == n){
                return true;
            }
            index++;
        }
        return false;
    }
}
