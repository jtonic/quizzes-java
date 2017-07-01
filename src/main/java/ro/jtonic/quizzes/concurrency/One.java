package ro.jtonic.quizzes.concurrency;

public class One {

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in thread: " + Thread.currentThread().getName());
            }
        });
        th.start();
        System.out.println("Running in main thread " + Thread.currentThread().getName());
        // write the code to block the current thread and wait maximum 200 msec for the execution of th.
    }

}
