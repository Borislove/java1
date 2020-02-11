package headfirstpattern.duck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();

        /*Вызов метода performQuack(), унаследованного классом MallardDuck; метод делегирует
         * выполнение операции по ссылке на QuackBehavior(то есть вызывает quack() через унаследованную
         * переменную quackBehavior)*/
        mallard.performQuack();
        /*Затем то же самое происходит с методом performFly(),так же унаследованным классом MallardDuck.*/
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
