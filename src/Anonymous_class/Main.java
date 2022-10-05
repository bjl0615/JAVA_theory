package Anonymous_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimall> animalls = new ArrayList<>();

        // 익명 클래스(Anonymous_class)
        // 1번 예시
//        AbstractAnimall horse = new AbstractAnimall("말"){
//            @Override
//            public void cry() {
//                System.out.println("히이잉");
//            }
//        };
//        horse.cry();
//        System.out.println(horse.name);

        // 2번 예시
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++) {
            System.out.println("동물원에서 어떤 동물을 키울까요??");
            String name = sc.next();
            System.out.println(name + "의 울음소리는 어떤가요??");
            String sound = sc.next();

            // 사용자 입력으로 받은 동물 클래스를 만들면
            animalls.add(new AbstractAnimall(name) {
                @Override
                public void cry() {
                    System.out.println(sound);
                }
            });
        }

        System.out.println("보유 동뮬들");
        for(AbstractAnimall animal : animalls) {
            System.out.println(animal.name);
            animal.cry();
        }
    }
}
