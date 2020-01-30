package Warehouse.projectr;

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
        System.out.println(Drinks.kofee + " - " + Drinks.KOFEE + " "+ Currency.sRuble);
        System.out.println(Drinks.kofeemilk+ " - " + Drinks.KOFEE_MILK+ " "+ Currency.sRuble);
        System.out.println("");

        System.out.println("           Просто чай:");
        System.out.println(Drinks.tea+ " - " + Drinks.PRICE+ " "+ Currency.sRuble);
        System.out.println(Drinks.teaSugar+ " - " + Drinks.PRICE_SUGAR_TEA+ " "+ Currency.sRuble);
        System.out.println(Drinks.iceTea+ " - " + Drinks.PRICE_ICE_TEA+ " "+ Currency.sRuble);
        System.out.println(Drinks.teaLemon+ " - " + Drinks.PRICE_TEA_LEMON+ " "+ Currency.sRuble);
        System.out.println("");
        System.out.println("         Горячий шоколад:");
        System.out.println(Drinks.shoco+ " - " + Drinks.PRICE_SHOCO+ ""+ Currency.sRuble);
        System.out.println("-------------------------------------------");

        //видимо сюда отдельно сахар и лемон и молоко


        System.out.println("типа счет");
        //Drinks d = new Drinks();
        System.out.println(Drinks.iceTea + " - " + Drinks.PRICE + " " + Currency.sEuro);  // в евро чет дофига за чай
//простой чаек
        System.out.println(Drinks.iceTea + " - " + Drinks.PRICE + " " + Currency.sRuble);  // во в рублях
        //с сахарком очень дорогой чай
        System.out.println(Drinks.iceTea + " - " + Drinks.PRICE + Drinks.PRICE_SUGAR + " " + Currency.sRuble); //должно быть 21 но не 201 )

        //видимо скобки нужны
        System.out.println(Drinks.iceTea + " - " + (Drinks.PRICE + Drinks.PRICE_SUGAR) + " " + Currency.sRuble); //21 хорошо +

       // System.out.println("                                   ИТОГО:");

    }
}
