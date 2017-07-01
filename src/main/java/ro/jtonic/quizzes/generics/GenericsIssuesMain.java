package ro.jtonic.quizzes.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jtonic on 17.04.2014.
 */
public class GenericsIssuesMain {

    public static void main(String[] args) {
        useInstanceOf();
        createAnInstanceOfGeneric("a");
        createAnArrayOfGenerifiedList();
        useGenericTypeLiteral("A", "B");
    }

    private static void useInstanceOf() {
        List<String> strs = new ArrayList<>();
        // 1. Uncomment here!!!
/*
        if (strs instanceof List<String>) {
            System.out.println("Good");
        }
*/
    }

    private static void createAnArrayOfGenerifiedList() {
        // 2. Uncomment here!!!
/*
        List<String>[] lst = {Arrays.asList("a", "b"), Arrays.asList("1", "2")};
        System.out.println("lst = " + lst);
*/
    }

    private static <T> void createAnInstanceOfGeneric(T t) {
        // 3. Uncomment here!!!
        // T a = new T();
    }

    private static <E> void useGenericTypeLiteral(E e, String str) {
        // 4. Uncomment here!!!
        // final Class<E> eClass = E.class;
    }

}
