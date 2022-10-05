package ZooPark;

public class Pig extends AbstractAnimall{

    Pig(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("꿀꿀");
    }
}
