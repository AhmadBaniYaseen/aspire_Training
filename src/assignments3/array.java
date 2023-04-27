package assignments3;

public class array {

    private static int findMin(int[] array){
        int min=array[0];
        for (int n : array) {
            if(n<min){
                min=n;
            }
        }

        return min;
    }

    private static int findMax(int[] array){
        int max=array[0];
        for (int n : array) {
            if(n>max){
                max=n;
            }
        }

        return max;
    }

    public static double findAverage(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum+=n;
        }
        double average = (double) sum / array.length;
        return average;
    }
    public static  int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        return (array);
    }

    public static void main(String[] args) {

        int[] array = {6, 3, 15, 10, 9, 2};
        int []arr=sortArray(array);
        System.out.println("The minimum value in the array is: " + findMin(array));
        System.out.println("The minimum value in the array is: " + findMax(array));
        System.out.println("The average of the values in the array is: " + findAverage(array));
        System.out.print("The sorted array is = ");
        for (int number : arr ) {
            System.out.print("  "+ number);
        }
    }
}
