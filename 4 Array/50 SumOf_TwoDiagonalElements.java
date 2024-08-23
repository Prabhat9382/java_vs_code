class SumOf_TwoDiagonalElements {

    public static void main(String[] args){
        System.out.println("Create a 2D array...");
        int[][] arr = ArrayUtility.input2DArray();
        ArrayUtility.display2DArray(arr, arr.length, arr[0].length);
        long sum = sum(arr);
        System.out.println("Sum of two diagonal elements: " + sum);
    }
    public static long sum(int[][] array){
        long sum = 0;
        sum = sumofLeftDiagonal(array) + sumofRightDiagonal(array);
        int n = array.length;
        if (n % 2 != 0){
            sum -= array[n/2][n/2];
        }
        return sum;
    }
    public static long sumofLeftDiagonal(int[][] array){
        long sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i][i];
        }
        return sum;
    }
    public static long sumofRightDiagonal(int[][] array){
        long sum = 0;
        int k = 0, l = array[0].length-1;
        while(k < array.length){
            sum += array[k++][l--];
        }
        return sum;
    }
    
}
