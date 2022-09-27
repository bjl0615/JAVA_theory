public class Wrapper_Class {
    public static void main(String[] args) {
        /*
            Wrapper 클래스란?
                기본 자료형을 객체형식으로 감싸는 역할을 한다.
                Integer클래스는 int형을, Double 클래스는 double을, Long 클래스는 long을, Boolean 클래스는 boolean을 감싸는 것이다.

            필요한 이유는?
                기본자료형(Primitive Type)을 참초형(Reference Type)처럼 다루어야 할 때 Wrapper 클래스를 사용하면 된다.
                예를 들어서 ArrayList같은 컬렉션을 사용할 떄 꼭 참조형을 사용해야 한다.
         */
//        Integer i = new Integer(123);
//        Integer i = 123;

        System.out.println(123 == 123);
        System.out.println(new Integer(123) == new Integer(123));

        /*
            첫 번쨰 출력문의 결과는 True이다 하지만 두번쨰 출력문은 False가 나온다
            참조형의 비교연산자는 가라키는 객체가 같은지 비교하기 때문이다. 두 생성자를 통해 만든 다른 객체이기 때문에 false가 나오는 거다.

            두 String 인스턴스를 비교할 때 처럼 equals 메소드를 쓰면 '값'이 같은지 확인할 수 있다.
         */
        System.out.println(new Integer(123).equals(new Integer(123)));
    }
}
