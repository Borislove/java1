package headfirstpattern.duck;

//Реализация поведения для уток, которые не летают(например резиновых).
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
