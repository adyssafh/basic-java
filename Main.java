import java.util.Scanner;

public class Main {
    // public static void main(String[] args) {
    // String name = "adyssa";
    // int x = 5;
    // int y = 6;
    // x = 9;
    // int sum = x + y;
    // System.out.println("Hello, " + name);
    // System.out.println("Result: " + sum);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berat:");
        int weight = sc.nextInt();
        System.out.print("Tinggi:");
        int height = sc.nextInt();
        System.out.println("BMI: " + calculateBMI(weight, height));
        sc.close();
    }

    static double calculateBMI(int weight, int height) {
        double heightInMeters = height / 100.0;
        return weight / (Math.pow(heightInMeters, 2));
    }
}