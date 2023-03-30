import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = s.nextInt();
        System.out.print("Enter the second integer: ");
        int b = s.nextInt();
        int sum = ATI(a, b);
        System.out.println("The sum is " + sum);
    }
    public static int ATI(int a, int b) {
        return a + b;
    }
}