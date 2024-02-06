import java.util.Scanner;
public class MeasureDiffrence {
    public static void main(String[] arg) {
        int[] values = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef 20 positieve getallen in");
        for (int i = 1; i < values.length; i++) {
            System.out.print("Geef getal " + i + " " + "in: ");
            values[i] = scanner.nextInt();
        }
        boolean areValuesUnique = true;
        for (int j = 0; j < values.length; j++) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] == values[j]) {
                    if (i != j) areValuesUnique = false;
                }
            }
        }
        if (areValuesUnique)
            System.out.println("Alle getallen zijn uniek");
        else if (!areValuesUnique)
            System.out.println("Er zitten dubbele getallen in de reeks");
    }
}

