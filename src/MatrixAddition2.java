import java.util.Scanner;
public class MatrixAddition2{
    public static void main(String args[]){
        int row, col,i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("wat is de lengte");
        row = in.nextInt();
        System.out.println("wat is de breedte");
        col = in.nextInt();

        int m1[][] = new int[row][col];
        int m2[][] = new int[row][col];
        int res[][] = new int[row][col];

        System.out.println("Geef de elementen van Matrix1 in");
        i=0;
        do{
            j=0;
            do{
                m1[i][j] = in.nextInt();
                j++;
            }while(j < col);
            i++;
        } while ( i < row);
        System.out.println("Geef de elementen van matrix2 in");
        i=0;
        do{
            j=0;
            do{
                m2[i][j] = in.nextInt();
                j++;
            }while(j < col);
            i++;
        } while ( i < row);
        i=0;
        do{
            j=0;
            do{
                res[i][j] = m1[i][j] + m2[i][j] ;
                j++;
            }while(j < col);
            i++;
        }while ( i < row);
        System.out.println("Som van de Matrix");
        i=0;
        do{
            j=0;
            do{
                System.out.print(res[i][j]+"\t");
                j++;
            }while(j < col);
            System.out.println();
            i++;
        }while(i< row);
    }
}
