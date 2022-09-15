public class Driver {
    static int count = 0;
    public static void main(String[] args) {
//        System.out.println(Math.abs(-10)); // 절대값
//        System.out.println(Math.max(3,7)); // 두 값 중 최댓값
//        System.out.println(Math.random()); // 0.0과 1.0 사이의 랜덤 값
        System.out.println(Driver.count);

        Driver.increment();
        System.out.println(Driver.count);

        Driver.increment();
        System.out.println(Driver.count);

        Driver.increment();
        System.out.println(Driver.count);

//        언제 클래스 메소드를 써야할지 판단하기 어렵다면, 이 질문을 해보세요.
//
//        "생성된 인스턴스가 하나도 없더라도 이 메소드를 호출하는 게 말이 되나요?"
//
//        정답이 'Yes'라면 클래스 메소드, 즉 static 메소드를 사용하면 됩니다!
    }

    public static void increment() {
        count++;
    }


}
