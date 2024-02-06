public class RandomArray {
    public static void main(String[] args) {
        int[][] arr = new int[30][60];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 100.0 - 50.0);
            }
        }
        int zerocount = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > 0) {
                    positive++;
                }
                else if (arr[i][j] < 0) {
                    negative++;
                } else {
                    zerocount++;
                }
            }
        }
        System.out.println("Er zijn " + positive + " positieve getallen, " + negative + " negatieve getallen en " + zerocount + " nullen");
    }
}
