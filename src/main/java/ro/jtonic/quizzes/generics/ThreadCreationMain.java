package ro.jtonic.quizzes.generics;

public class ThreadCreationMain {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        });
        th.start();
        System.out.println("Running in main thread " + Thread.currentThread().getName());
        th.join(200); // the current thread (main) is waiting for completion of thread th
    }

}
