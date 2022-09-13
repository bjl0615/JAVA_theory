public class Null {
    public static void main(String[] args) {
        Person1[] people = new Person1[5];
        people[0] = new Person1("김신의" , 28);
        people[2] = new Person1("문종모" , 26);
        people[3] = new Person1("서혜린" , 21);

        for(int i = 0 ; i < people.length ; i++) {
            Person1 p = people[i];
            if( p != null) {
                System.out.println(p.getName());
            } else {
                System.out.println(i + "번 자리는 비어있습니다.");
            }

        }

    }
}
