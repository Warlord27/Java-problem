import java.util.Scanner;

/**
 * interview
 * Write a Java program to read a string and return it without the first two characters. Keep the first character if it is 'g' and keep the second character if it is 'h'.
 */
public class interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String sta = sc.next().toLowerCase();
        sta=sta.trim();
        int flag1=0,flag2=0;
        if(sta.charAt(0)=='g')
        flag1=2;
        if(sta.charAt(1)=='h')
        flag2=2;


        if(flag1==2 && flag2==2)
        System.out.println("Result: "+sta);
        else if(flag1==2 && flag2!=2)
        System.out.println("Result: "+sta.charAt(0)+sta.substring(2));
        else if(flag1!=2 && flag2== 2)
        System.out.println("Result: "+sta.substring(1));
        else
        System.out.println("Result: "+sta.substring(2));

    }

}