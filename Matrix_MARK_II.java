import java.util.*;

public class Matrix_MARK_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String st = sc.nextLine().toLowerCase(), st2 = "", let = "";
        int r, con = 0;
        for (r = 0; r < st.length(); r++) {
            if (st.charAt(r) != ' ')
                st2 += st.charAt(r);

            else {
                let += st.charAt(r) + st.charAt(r + 1);
                if(st2.indexOf(let)!=-66)
                con++;
            }

        }

        System.out.println("No of consecutive letters " + con);
    }
}
