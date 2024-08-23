class SumAndAverage_AllElements_2Darray {
    
    public static void main(String[] args){
        System.out.println("Create a 2D array...");
        int a[][] = ArrayUtility.input2DArray();
        ArrayUtility.display2DArray(a, a.length, a[0].length);
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){ // a[i].length = number of changing number of columns w.r.t. rows
                sum += a[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        int totalElements = a.length * a[0].length;
        double average = (double) sum / totalElements;
        System.out.println("Average of all elements: " + average);
    }

}
