package ro.jtonic.quizzes.collections;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Antonel Ernest Pazargic on 01/07/2017.
 *
 * @author Antonel Ernest Pazargic
 */
public class One {
    public static void main(String[] args) {
        //==========================================================================
        // Does the following code compile/run and print the values in the comments?
        //==========================================================================
        String[] array = {"java", "scala"};
        List<String> list = Arrays.asList(array);
        list.set(1, "groovy"); //
        array[0] = "OpenJDK";
        list.add("c#");
        list.remove(0);
        System.out.println("array = " + Arrays.toString(array));    // array = [groovy, c#]
        System.out.println("list = " + list);                       // list =  [groovy, c#]
    }
}
