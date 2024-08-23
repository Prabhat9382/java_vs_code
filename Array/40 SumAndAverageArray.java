class SumAndAverageArray {
    public static void main(String[] args){
        
        int[] numArray = ArrayUtility.ScanningArray();
        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + " ");
        }
        System.out.println();
        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("Sum fo the numbers in the array is: " + sum);
        System.out.println("Average of the numbers in the array is: " + average);
        
    }    
    public static long sum(int[] Arr){
        long sum = 0;
        for(int i = 0; i < Arr.length; i++){
            sum += Arr[i];
        }
        return sum;
    }
    public static double average(int[] numArray){ // this method returns double data type
        return sum(numArray)/(double)(numArray.length);//numArray.length is int data type, double converts it to
        // double, then sum(numArray) i.e. long type is divided by double data type
        // `double` has a higher precision and can represent fractional values, whereas `long` cannot. So, the division 
        // operation results in a `double` to ensure the precision of the result.
    }
    
}
