import java.util.Scanner;
public class Sums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hoe lang wil je de lengte? : ");
        int length = scanner.nextInt();
        System.out.println("hoe breed wil je de breedte? : ");
        int width = scanner.nextInt();
        int[][] arr = new int[length][width];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Geef het volgende element in : ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }
}
