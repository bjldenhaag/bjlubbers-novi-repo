public class Bke {
    public static void main(String[] args) {
        char[][] veld = {
                { 'O', 'X', 'X'},
                { 'O', 'X', 'O'},
                { 'X', 'O', 'X'}
        };

        // diagonaal 1 (linksboven naar rechtsonder)
        if (veld[0][0] == veld[1][1] && veld[1][1] == veld[2][2]) {
            System.out.println("d1: " + veld[0][0]);
        }

        // diagonaal 2
        if (veld[0][2] == veld[1][1] && veld[1][1] == veld[2][0]) {
            System.out.println("d2: " + veld[0][2]);
        }

        // rijen
        for (int r = 0; r < 3; r++) {
            if (veld[r][0] == veld[r][1] && veld[r][1] == veld[r][2]) {
                System.out.println("Rij: " + r);
                System.out.println("rij: " + veld[r][0]);
            }
        }

        // kolommen
        for (int k = 0; k < 3; k++) {
            if (veld[0][k] == veld[1][k] && veld[1][k] == veld[2][k]) {
                System.out.println("kolom: " + veld[0][k]);
            }
        }
    }
}
