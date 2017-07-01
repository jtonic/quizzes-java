package ro.jtonic.quizzes.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antonel Ernest Pazargic on 01/07/2017.
 *
 * @author Antonel Ernest Pazargic
 */
public class Three {

    public static void main(String[] args) {
/*
        one();
        two();
*/
    }

/*
    private static void one() {
        List<? extends Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add((byte)2);
        numbers.remove(10);
        for (Number number : numbers) {
            System.out.println("number.intValue() = " + number.intValue());
        }
    }
*/

/*
    private static void two() {
        List<? super IOException> ioExcs = new ArrayList<Exception>();
        ioExcs.add(new IOException());
        ioExcs.add(new FileNotFoundException());
        ioExcs.add(new Exception());
    }
*/

}
