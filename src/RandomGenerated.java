    import java.util.Arrays;
    public class RandomGenerated {
        public static void main(String[] args) {
            int[] row = new int[100];


            for (int i = 0; i < row.length; i++) {
                row[i] = (int) (Math.random() * 100.0 - 50.0);
            }


            System.out.println("1st rij:");
            System.out.println(Arrays.toString(row));


            int positive = 0;
            int negative = 0;
            int nul = 0;


            for (int getal : row) {
                if (getal > 0) {
                    positive++;
                } else if (getal < 0) {
                    negative++;
                } else {
                    nul++;
                }
            }


            System.out.println("Aantal positieve getallen: " + positive);
            System.out.println("Aantal negatieve getallen: " + negative);
            System.out.println("Aantal nullen: " + nul);
        }
    }

