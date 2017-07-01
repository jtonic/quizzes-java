package ro.jtonic.quizzes.collections;

import java.util.Arrays;

/**
 * Created by Antonel Ernest Pazargic on 01/07/2017.
 *
 * @author Antonel Ernest Pazargic
 */
public class Two {
    public static void main(String[] args) {
        //==========================================================================
        // Does the following code compile? What value will be printed?
        //==========================================================================
        int[] numbers = {2, 4, 1, 10, 3};
        System.out.println(Arrays.binarySearch(numbers, 4));
    }
}
