package ro.jtonic.quizzes.generics;


/**
 * Created by Antonel Ernest Pazargic on 01/07/2017.
 *
 * @author Antonel Ernest Pazargic
 */
public class Two {

    public static void main(String[] args) {
        // remove the comments. what is printed out in the console (consider that required imports are correct)?
        Utils.printAsLetter("Hi, ", "Antonel");
        Utils.<String>removeSpaces();
    }

}

class Utils<V extends String> {

    private static V v;

    public static <T extends String> void printAsLetter(String salutation, T t) {
        System.out.println(salutation + t);
    }

    public static void removeSpaces() {
        System.out.println("remove spaces");
    }
}
