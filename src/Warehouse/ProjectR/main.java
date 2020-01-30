package Warehouse.ProjectR;

public class main {

    public static void main(String[] args) {

        // TODO: 19.12.2019  тут можно сократить
        ProjectR r = new ProjectR();
        r.testTest();
        System.out.println("------------------------------------------");
        System.out.println("          Добро пожаловать в кофейню");
        System.out.println("------------------------------------------");
        System.out.println("                  меню");
        System.out.println("        Самый вкусный кофе:");
        System.out.println(Drinks.kofee);
        System.out.println(Drinks.kofeemilk);
        System.out.println("");

        System.out.println("           Просто чай:");
        System.out.println(Drinks.tea);
        System.out.println(Drinks.teaSugar);
        System.out.println(Drinks.iceTea);
        System.out.println(Drinks.teaLemon);
        System.out.println("");
        System.out.println("         Горячий шоколад:");
        System.out.println(Drinks.shoco);
        System.out.println("-------------------------------------------");


        System.out.println("типа счет");
        //Drinks d = new Drinks();
        System.out.println(Drinks.iceTea + " - " + Drinks.PRICE + " " + Currency.sEuro);  // в евро чет дофига за чай
//простой чаек
        System.out.println(Drinks.iceTea + " - " + Drinks.PRICE + " " + Currency.s);  // во в рублях
        //с сахарком очень дорогой чай
        System.out.println(Drinks.iceTea + " - " + Drinks.PRICE + Drinks.PRICE_SUGAR + " " + Currency.s); //должно быть 21 но не 201 )

        //видимо скобки нужны
        System.out.println(Drinks.iceTea + " - " + (Drinks.PRICE + Drinks.PRICE_SUGAR) + " " + Currency.s); //21 хорошо +


    }
}
