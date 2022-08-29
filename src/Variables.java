public class Variables {
    public static void main(String[] args) {
        boolean myBoolean = true;
        myBoolean = false;

        /*
            -2147483648 ~ 2147483647
         */
        int myInt = 123;

        /*
            -9223372036854775808 ~ 9223372036854775807

            long x = 12345678910l; // 소문자 l은 1과 헷갈릴 수 있음

            long x = 12345678910L; // 권장사항
         */
        long myLong = 12345678910L;

        double myDouble = 3.14;

        String myString = "codeit!";

        System.out.println("hello!");

        String hello = "Hello, I'm ";
        String dot = ".";

        System.out.println(hello);
        System.out.println(27);
        System.out.println(dot);
    }
}
