import java.util.*;

public class Dele_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int r, cho, n = 10;
        // ✅Deletation Part 2
        for (r = 0; r < 10; r++) {
            System.out.print("Enter a number:  ");
            num[r] = sc.nextInt();
        }
        // 🔰🔰
        for (int i = 0; i < num.length; i++)
            System.out.print(" " + num[i] + "   ");

        System.out.println("Enter the position: ");

        cho = sc.nextInt();
        for (r = cho + 1; r < n; r++) {
            num[r - 1] = num[r];
            n--;
        }
        num[9] = 0;
        for (r = 0; r < 10; r++)
            System.out.print("  " + num[r] + "  ");

    }

}