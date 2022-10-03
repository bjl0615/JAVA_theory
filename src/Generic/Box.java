package Generic;
/*
    꺽쇠 기호(<>)사이에 있는 T를 '타입 파라미터'라고 부른다. 그리고 Box와 같이 타입 파라미터를 받는 클래스를 '제네렉 클래스(Generic Class)'라고 한다.

    Box<String> box = new Box<>();
    타입을 파라미터 String으로 넘겨주면

    클래스에 있던 모든 T가 String으로 대체가 된다.

    public class Box<String> {
    private String object;

    public void set(String object) {
        this.object = object;
    }

    public String get() {
        return object;
    }

    원하는 대로 타입 파라미터의 이름을 설정할 수 있다.
    가장 흔히 쓰는 이름은 T(Type)과 E(Element)이다.
    만약 HashMap<K, V>의 경우에는 K(Key)와 V(Value)이다. T1, T2, T3처럼 숫자를 붙을 수도 있다.


 */
public class Box<T> {
    private T something;

    public void set(T object) {
        this.something = object;
    }

    public T get() {
        return something;
    }
}
