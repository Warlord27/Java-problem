import java.util.Scanner;

public interface Boundary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int nr = sc.nextInt();
        System.out.println("Enter the no of coloumns: ");
        int nc = sc.nextInt();
        System.out.println();
        int mat[][] = new int[nr][nc];

        int r, c, con = 0;

        // input
        for (r = 0; r < nr; r++) {
            for (c = 0; c < nc; c++) {
                System.out.print("Enter: ");
                mat[r][c] = sc.nextInt();
                if (r == 0 || c == 0 || r == nr - 1 || c == nc - 1)
                    con++;
            }
        }
        System.out.println();
        // display
        for (r = 0; r < nr; r++) {
            for (c = 0; c < nc; c++) {
                System.out.print(mat[r][c] + "  ");
            }
            System.out.println();
        }

        System.out.println();

        int mach[] = new int[con];
        int d = 0;

        // Making a array of boundary
        for (r = 0; r < nr; r++) {
            for (c = 0; c < nc; c++) {
                if (r == 0 || c == 0 || r == nr - 1 || c == nc - 1)
                    mach[d++] = mat[r][c];
            }
        }
        // Sorting
        for (r = 0; r < con; r++) {
            for (c = 0; c < con - 1 - r; c++) {
                if (mach[c] > mach[c + 1]) {
                    int tem = mach[c];
                    mach[c] = mach[c + 1];
                    mach[c + 1] = tem;
                }
            }
        }

        // Inserting
        d = 0;
        for (r = 0; r < nr; r++) {
            for (c = 0; c < nc; c++) {
                if (r == 0 || c == 0 || r == nr - 1 || c == nc - 1)
                    mat[r][c] = mach[d++];
            }
        }

        // Display
        for (r = 0; r < nr; r++) {
            for (c = 0; c < nc; c++) {
                System.out.print(mat[r][c] + "  ");
            }
            System.out.println();
        }

    }
}
