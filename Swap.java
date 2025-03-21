import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input integer a:");
        int a = sc.nextInt();
        System.out.print("Input integer b:");
        int b = sc.nextInt();
        System.out.println("Before swapping: " + a + " " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b);
    }
}
