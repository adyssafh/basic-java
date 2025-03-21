import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input integer a:");
        int a = sc.nextInt();
        System.out.print("Input integer b:");
        int b = sc.nextInt();
        System.out.print("Input integer c:");
        int c = sc.nextInt();
        sc.close();

        System.out.println("The largest number is: " + largest(a, b, c));
    }

    static int largest(int a, int b, int c) {
        int num[] = { a, b, c };
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
