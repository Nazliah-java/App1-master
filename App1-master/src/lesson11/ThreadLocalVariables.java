package lesson11;

public class ThreadLocalVariables {
    
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++)
        {Thread thread = new Thread(() -> {

            threadLocal.set((int)(Math.random() * 100));
            System.out.println("Thread: " + Thread.currentThread().getId() + ": " + threadLocal.get());

        });

        thread.start();
        }
    }
}
