import java.util.Arrays;
import java.util.Scanner;
public class NumberSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Voer Getal " + (i + 1) + " in : ");
            ints[i] = scanner.nextInt();
        }
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}


