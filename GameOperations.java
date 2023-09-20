import java.util.Arrays;

public class GameOperations {

    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println(ArrayMax(intArray));
        System.out.println(ArrayMin(intArray));
        System.out.println(Average(intArray));
        System.out.println(Arrays.toString(averageArray(intArray)));
    }

    public static int ArrayMin (int[] numbers) {
        int min = numbers[0];
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int ArrayMax (int[] numbers) {
        int max = numbers[0];
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static double Average (int[] numbers) {
        double sum = 0;
        for(int i = 0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double average = sum/numbers.length;
        return average;
    }

    public static double[] averageArray (int[] numbers) {
        double average = Average(numbers);
        double [] result = new double[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] - average;
        }
        return result;
    }
}
    


