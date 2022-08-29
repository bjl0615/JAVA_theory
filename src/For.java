public class For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;  i <= 5; i++) {
            sum += i;
        }

        int i , j = 1;
        for(i = 1; i <= 9 ; i++) {
            for(j = 1; j <= 9 ; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
