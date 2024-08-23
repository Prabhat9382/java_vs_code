public class TwoDimensional_Arrays {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6,7}};
        System.out.println("Number of rows(elements) in 2D array: " + arr.length);
        System.out.println("Number of elements in the first array at the 0th index in 2D array: " + arr[0].length);
        System.out.println("Number of elements in the second  array at the 1st index in 2D array: " + arr[1].length);

        System.out.println("Printing the array...");
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        
        int[][] myArr = new int[3][4];
        myArr[0][0] = 9;

    }
}
