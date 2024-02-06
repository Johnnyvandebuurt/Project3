import java.util.Scanner;
public class SearchNrInArray {
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
        System.out.println("Geef een getal in : ");
        int number = scanner.nextInt();
        boolean sameNumber = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == number) {
                    sameNumber = true;
                }
                else if (j == number){
                        sameNumber = true;
                }
            }
        }
        if(sameNumber){
            System.out.println("Je getal zit in de array.");
        }
        else if(!sameNumber) System.out.println("Je getal zit niet in de array.");
    }
}
