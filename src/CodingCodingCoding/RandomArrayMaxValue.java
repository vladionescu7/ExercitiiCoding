package CodingCodingCoding;
import java.util.Random;

public class RandomArrayMaxValue {
    public static void main(String[] args) {
        //Write an application that will find biggest value within array of int variables.
        //
        //a. check your application using randomly generated array (use Random class),
        //b. check your application at least 5 times in a loop (generate random array -> print
        int[] randomIntegersArray = new int[8];
        Random rnd = new Random();
        for (int i = 0; i < randomIntegersArray.length; i++) {
            randomIntegersArray[i] = rnd.nextInt(100);
            System.out.println(randomIntegersArray[i]);
        }
        int max = MaximumValue(randomIntegersArray);
        System.out.println("Cel mai mare numar dintre cele generate random este: " + max);
    }

    public static int MaximumValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }
}

