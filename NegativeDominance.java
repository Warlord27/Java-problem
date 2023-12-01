import java.util.*;

public class NegativeDominance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, elem[] = new int[8],pos=0,neg=0;
        for(r=0;r<8;r++){
            System.out.println("Enter a Integer: ");
            elem[r]=sc.nextInt();
            if(elem[r]<0)
            neg++;
            else
            pos++;
        }

        if(neg>pos)
        System.out.println("It is a Negetive Dominant array.");
        else
        System.out.println("It is not a Negetive Dominant array.");
    }
}
