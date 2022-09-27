import java.util.Random;

public class Math_Class {
    public static void main(String[] args) {
        //절대값
        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(8));

        // 두 수중의 최소값 , 최대값
        System.out.println(Math.min(4,10));
        System.out.println(Math.max(4, 10));
        
        // 랜덤 클래스
        Random rand = new Random();
        System.out.println(rand.nextInt(10));
    
        // a와 b 사이의 랜덤 값
        int min = 10;
        int max = 30;
        System.out.println(rand.nextInt((max-min) + 1) + min);
    }
}
