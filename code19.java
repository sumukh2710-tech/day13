public class code19 {

    int count = 0;

    synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        code19 counter = new code19();

        Thread[] threads = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(() -> counter.increment());
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Final count: " + counter.count);
    }
}
