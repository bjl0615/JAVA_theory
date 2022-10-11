package ZooPark;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimall> animals = new ArrayList<>();

        animals.add(new Cat("맥스"));
        animals.add(new Dog("실바"));
        animals.add(new Pig("품바"));

        for(AbstractAnimall animal : animals) {
            System.out.print(animal.name + "의 울음소리 : ");
            animal.cry();
        }
    }
}
