public class try_catch {
    public static void main(String[] args) {
        int[] smallArray = new int[3];

            for (int i = 0; i < 10; i++) {
                try {
                    smallArray[i] = i;
                }catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println(i+" 번째");
                }
            }

    }
}
