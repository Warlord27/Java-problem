import java.util.Scanner;

public class p2_FarenhiteToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elememts in side the array");
        double arr[] = new double[9];
        int i;
       for(i=0;i<9;i++){
            arr[i] = sc.nextDouble();
            arr[i] = ((arr[i] - 32) / 9) * 5;

        }
    //    System.out.println(arr[5]+arr[]);
    }
}
