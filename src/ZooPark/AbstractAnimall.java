package ZooPark;

public abstract class AbstractAnimall{
    public final String name;
    public String cry;
    AbstractAnimall(String name) {
        this.name = name;
    }

    public void SetCry(String cry) {
        this.cry = cry;
    }

    public void cry() {
        System.out.println(cry);
    }
}
