import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berat:");
        int weight = sc.nextInt();
        System.out.print("Tinggi:");
        int height = sc.nextInt();
        System.out.println("BMI: " + calculateBMI(weight, height));

        // array
        // String[] pokemon = { "Pikachu", "Snorlax", "Mew", "Squirtle", "Charmander",
        // "Dragonite" };
        // System.out.println(pokemon[0]);

    }

    static double calculateBMI(int weight, int height) {
        double heightInMeters = height / 100.0;
        return weight / (Math.pow(heightInMeters, 2));
    }
}