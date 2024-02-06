import java.util.Scanner;
public class PrintBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Voer 10 getallen in:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Getal " + (i + 1) + ": ");
            numbers [i] = scanner.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}