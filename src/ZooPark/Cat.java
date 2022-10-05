package ZooPark;

public class Cat extends AbstractAnimall{
    Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("야옹");
    }
}
