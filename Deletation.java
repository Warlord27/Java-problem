import java.util.*;

public class Deletation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, pos, am[] = new int[10], n = 10;
        for (r = 0; r < 10; r++) {
            System.out.print("Enter a number: ");
            am[r] = sc.nextInt();
        }

        System.out.println("Enter the position of the element: ");
        pos = sc.nextInt();
        for (r = pos + 1; r < n; r++) {
            am[r - 1] = am[r];
            n--;
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("After deletation");
        for (r = 0; r < 10; r++)
            System.out.println(am[r]);
    }
}
