package Warehouse.projectr;

//че тут..
    //Интересно енам добавить...но пока и так хорошо идет!
    //по классам тоже бы распределить все...в одной куче
    //хм идея сделать меню консольное , т.е меню, что попить поесть...подсказки в проекте Хелпер
//чутка плаваю, ооп надо разбирать

    public class ProjectR {

        public static void testTest(){

            // TODO: 19.12.2019    напиток, цена(price т.е объявленно столько то) + цена (в валюте/спецсимвол)
            //

            int a = 100;

            int aBacks = a / 2; //это типа курс валют?
            int aEuro = a / 3;

            String s = " \u20BD";   //спецсимвол рубля!
            String sBacks = "$" ; //бакс
            String sEuro = "€\n"  ;  //евро

            String napitok = "Kofee";
            String price = "price: " ;  //цена
            String quantity = "quantity "; //количество

            //System.out.println("Hello, world)"); //wtf?
            System.out.println(99);
            System.out.println("7+1");
            System.out.println(7+1);
            System.out.println("7"+"1");
            System.out.println("Кофе стоит "+ 100 + "руб");
            System.out.println("Кофе " + 50+50 + " руб");

            System.out.println("Кофе стоит " + (50+50)+ " руб");
            System.out.println("Кофе стоит " +(50+50)+ "\n руб");   //Перенос строки
            System.out.println("Кофе стоит " + a + "" + s);
            System.out.println("Кофе стоит " +  aBacks + " " + sBacks);
            System.out.println("Кофе стоит " +  aEuro + " " + sEuro);

            System.out.println(napitok + " "+ price +" " + aEuro + " " + sEuro);   //куча пробелов!!!

            System.out.println();
            System.out.println(Drinks.kofee);

        }
    }

