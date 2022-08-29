public class Array_test {
    public static void main(String[] args) {
        int Array[] = new int[30];
        for(int i = 0 ; i < Array.length ; i++) {
            Array[i] = 1001 + i;
        }

        String strArray[] = new String[4];
        strArray[0] = "Zero";
        strArray[1] = "One";
        strArray[2] = "Two";
        strArray[3] = "Three";

        for(int i : Array) {
            System.out.println(strArray[i % 4]);
        }
    }
}
