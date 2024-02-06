import java.util.Scanner;
public class MeasurementsAverage {

    public static void main(String[] args) {
        double[] arr = new double[72];
        double total = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("geeft getal nr."+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("Het gemiddelde is:  %.3f", average);
    }
}
