class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread2: " + i);
        }
    }
}

public class code17 {
    public static void main(String[] args) {
        new ThreadOne().start();
        new ThreadTwo().start();
    }
}
