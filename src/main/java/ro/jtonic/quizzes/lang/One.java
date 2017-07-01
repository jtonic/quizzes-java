package ro.jtonic.quizzes.lang;

/**
 * Created by Antonel Ernest Pazargic on 01/07/2017.
 *
 * @author Antonel Ernest Pazargic
 */
public class One {
    public static void main(String[] args) {
        // what the following 2 lines will print out if the comments are removed.
        // System.out.println("The result of 2 + 2 = " + 2 + 2);
        // System.out.println("2 != 3" + 2 != 3);

        // what the following println statements print out?
        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = new Integer(127);
        Integer i4 = Math.abs(new Integer(127));

        Integer i5 =  200;
        Integer i6 =  200;

        System.out.printf("i1 == i2 = %s\n", i1 == i2);
        System.out.printf("i2 == i3 = %s\n", i2 == i3);
        System.out.printf("i1 == i4 = %s\n", i1 == i4);

        System.out.printf("i5 == i6 = %s \n\n", i5 == i6);

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new StringBuffer("java").append("").toString();
        String s5 = s3.intern();

        System.out.printf("s1 == s2 %s\n", s1 == s2);
        System.out.printf("s1 == s3 %s\n", s1 == s3);
        System.out.printf("s1 == s4 %s\n", s1 == s4);
        System.out.printf("s1 == s5 %s\n", s1 == s5);
    }
}
