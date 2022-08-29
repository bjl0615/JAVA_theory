import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] intArray;
        intArray = new int[num];

        for(int i = 0 ; i < intArray.length ; i++) {
            intArray[i] = sc.nextInt();
        }

        for(int i = 0 ; i < intArray.length ; i++) {
            System.out.println(intArray[i]);
        }
    }
}
