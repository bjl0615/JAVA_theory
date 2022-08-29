public class WHILE {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 3)  {
            sum = sum + i;
            i = i + 1;
        }

        System.out.println(sum);
    }
}
