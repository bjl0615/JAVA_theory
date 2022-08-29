public class TypeConversCasting {
    public static void main(String[] args) {
        /*
            숫자형 랭킹 (용량 기준)
            double
            float
            long
            int
            short
            byte
         */
        double x = 3.14;
        int y = (int)x;

        System.out.println(y);

        int a = 9;
        int b = 5;
        System.out.println((double) a / b);

        /*
            Literal(리터럴)?
                리터럴이란 소스코드의 고정된 값을 대표하는 용어입니다.
         */
        int myInt = 123;
        byte myByte = 38;
        short myShort = 2;

        /*
            여기서 128, 38 , 2는 '정수 리터럴'이다 기본적으로 int 자료형이지만 byte나 short 변수의 초기값으로 설정하면
            아무 문제 ㅇ벗이 값이 들어간다.
         */

        long myLong = 123456478910L;

        /*
            위에서 12345678910L은 정수리터럴이 아닌 '롱 리터럴이다'
         */
    }
}
