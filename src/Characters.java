import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[8];
        double[] arr = new double[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Geef getal nr." + (i + 1) + " in: ");
            arr[i] = scanner.nextDouble();
        }
        System.out.print("Welk karakter wil je weten? : ");
        int position = scanner.nextInt();
        if (position < 1 || position > arr.length) {
            System.out.println("Ongeldige positie. Voer een positie in binnen het bereik van 1 tot " + arr.length);
        } else {
            char character = String.valueOf(arr[position - 1]).charAt(0);
            System.out.println("Het karakter op positie " + position + " is: " + character);
        }
        scanner.close();
    }
}


