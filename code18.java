class Printer {
    int number = 1;

    synchronized void printOdd() {
        while (number <= 10) {
            if (number % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.println("Odd: " + number++);
            notify();
        }
    }

    synchronized void printEven() {
        while (number <= 10) {
            if (number % 2 == 1) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.println("Even: " + number++);
            notify();
        }
    }
}

public class code18 {
    public static void main(String[] args) {
        Printer p = new Printer();

        new Thread(() -> p.printOdd()).start();
        new Thread(() -> p.printEven()).start();
    }
}
