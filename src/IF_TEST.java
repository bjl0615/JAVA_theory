public class IF_TEST {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        if(a == b) {
            System.out.println("a 와 b는 같습니다");
        } else if(a != b) {
            System.out.println("a와 b는 같지 않습니다.");
            if(a > b) {
                System.out.println("a기 b 보다" + (a - b) + "만큼 더 큽니다.");
            } else if(b > a) {
                System.out.println("b가 a보다 " + (b - a) + "만큼 더 큽니다.");
            }
        }
    }
}
