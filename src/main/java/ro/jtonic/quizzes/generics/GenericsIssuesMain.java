package ro.jtonic.quizzes.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jtonic on 17.04.2014.
 */
public class GenericsIssuesMain {

    public static void main(String[] args) {
        canNotUseInstanceOf();
        canNotCreateAnInstanceOfGeneric("a");
        canNotCreateAnArrayOfGenerifiedList();
        canNotUseGenericTypeLiteral("A", "B");
    }

    private static void canNotCreateAnArrayOfGenerifiedList() {
/*      Uncomment here to see the compilation issue caused by erasure
        List<String>[] lst1 = {Arrays.asList("a", "b"), Arrays.asList("1", "2")};
*/
        String[] lst2 = {"a", "b"};
    }

    private static <T> void canNotCreateAnInstanceOfGeneric(T t) {
/*      Uncomment here to see the compilation issue caused by erasure
        T a = new T();
*/
    }

    private static void canNotUseInstanceOf() {
        List<String> strs = new ArrayList<>();
/*      Uncomment here to see the compilation issue caused by erasure
        if (strs instanceof List<String>) {
            // code here
        }
*/
    }

    private static <E> void canNotUseGenericTypeLiteral(E e, String str) {
/*      Uncomment here to see the compilation issue caused by erasure
        final Class<E> eClass = E.class;
*/
        final Class<String> stringClass = String.class;
        final int fieldsNo = stringClass.getFields().length;
        System.out.println("fieldsNo = " + fieldsNo);
    }

}
