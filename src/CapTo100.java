import java.util.Scanner;
public class CapTo100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hoe lang wil je de lengte? : ");
        int length = scanner.nextInt();
        System.out.println("hoe breed wil je de breedte? : ");
        int width = scanner.nextInt();
        int[][] arr = new int[length][width];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 100.0 - 50.0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 100) {
                    arr[i][j] = 100;
                }
                else if (arr[i][j] < -100) {
                    arr[i][j] = -100;
                }
            }
        }
    }
}
