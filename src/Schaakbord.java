public class Schaakbord {

        private char[][] bord;

        public Schaakbord() {
            bord = new char[8][8];
            initializeBoard();
        }

        private void initializeBoard() {
            // Vul het schaakbord met beginopstelling
            // Hieronder staat een eenvoudige opstelling, je kunt deze aanpassen als je wilt
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i == 1 || i == 6) {
                        bord[i][j] = 'P'; // Pion
                    } else if ((i == 0 || i == 7) && (j == 0 || j == 7)) {
                        bord[i][j] = 'R'; // Toren
                    } else if ((i == 0 || i == 7) && (j == 1 || j == 6)) {
                        bord[i][j] = 'N'; // Paard
                    } else if ((i == 0 || i == 7) && (j == 2 || j == 5)) {
                        bord[i][j] = 'B'; // Loper
                    } else if (i == 0 && j == 3) {
                        bord[i][j] = 'Q'; // Koningin
                    } else if (i == 0 && j == 4) {
                        bord[i][j] = 'K'; // Koning
                    } else {
                        bord[i][j] = ' '; // Leeg veld
                    }
                }
            }
        }

        public void printBoard() {
            // Toon het schaakbord
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(bord[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Schaakbord schaakbord = new Schaakbord();
            schaakbord.printBoard();
        }
    }
