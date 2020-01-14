package Warehouse.Practick;

/*
Напиши мне прогу
Простейшую

Чтобы текст типа: 7801678586\780101001 ООО "Рога и Копыта"
превращался в ООО Рога и Копыта ИНН 7801678586 КПП 780101001*/


// TODO: 14.01.2020 разложить строку на массив строк
//сделать новый массив и внести туда значения

//задачу разбить на маленькие задачи


//7801678586\780101001  разделить значения


import java.sql.SQLOutput;
import java.util.Arrays;

public class Practic {


    public static void main(String[] args) {

      /* String original = "7801678586\\780101001  ООО \"Рога и Копыта\"" ;


        String[] konvert = original.split("\\s");
        for(String subStr:konvert) {

            System.out.println(subStr);

            String str[] = new String[subStr.length()] ;*/
          //  System.out.println(str.length);
            //Arrays.fill();
//            Arrays.fill(array, 0);

            //Arrays.fill(str, subStr);
          //  System.out.println(str.toString());
        //}




        String original = "7801678586\\780101001" ;
        String[] konvert = original.split("\\\\");
        for(String subStr:konvert) {
            System.out.println(subStr);

//1 Инн , 2 Кпп
            String str[] = {"inn","kpp"};
          //  System.out.println(str[0]);
//            System.out.println(str[1]);
            Arrays.fill(str,subStr);
            System.out.println(Arrays.toString(str));  //показать значения
            System.out.println("ИНН "+str[0] + " КПП "+str[1]);
            //System.out.println("КПП "+str[1]);
        }

     //   System.out.println("text original = " + original);
        System.out.println("text konverter "  );

    }
}

