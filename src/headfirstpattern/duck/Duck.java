package headfirstpattern.duck;

public abstract class Duck {
    //Объявляем две ссылочные переменные с типами интерфейсов поведения.
    //Переменные наследуются всеми субклассами Duck(в том же пакете).
    FlyBehavior flyBehavior;  //поведение полета
    QuackBehavior quackBehavior;          //поведение кряка

    public Duck() {

    }

    public abstract void display();

    //-----------делегирование операции классам поведение--------------
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    //-----------------------------------------------------------------
    public void swim() { //плавать
        System.out.println("All ducks float, even decoys!");  //Все утки плавают, даже приманки!
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

