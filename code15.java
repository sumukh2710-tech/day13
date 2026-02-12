import java.util.*;

public class code15 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            int result = 10 / a;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
