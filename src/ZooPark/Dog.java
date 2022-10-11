package ZooPark;

public class Dog extends AbstractAnimall{

    Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("왈왈");
    }
}
