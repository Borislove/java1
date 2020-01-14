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
// подсказочка получить правильные данные можно и без цикла


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
        System.out.println("text original = " + original);


        String[] konvert = original.split("\\\\");
        //Arrays.fill(konvert,0);
        //System.out.println(Arrays.toString(konvert));


       for(String subStr:konvert) {
        //    System.out.println(subStr);
//1 Инн , 2 Кпп
          //  System.out.println(str[0]);
//            System.out.println(str[1]);

              String str[] = {"inn","kpp"};


           /*Arrays.fill(str,subStr);
              String str1[] = {" "};
           Arrays.fill(str1,subStr);
*/
             Arrays.fill(str,subStr);  //заполняю значениями
                System.out.println("ИНН "+str[0] + " КПП "+str[0]);   //не те значения дает..странно
            //str[0] = subStr;
            //str[1] = subStr;
          //  System.out.println(Arrays.toString(str));  //показать значения

//            String[] strTest = new String[ "",""];
       //    System.out.println("ИНН "+str[0]);
         //   System.out.println("КПП "+str[0]);
            //System.out.println("КПП "+str[1]);

          /*  Arrays.fill(str,subStr);
            System.out.println("ИНН "+str[1]);
            Arrays.fill(str,subStr);
            System.out.println("КПП "+str[0]);*/


          //---------не вышло
        /*    String str1[] = {};
            Arrays.fill(str,subStr);
            System.out.println("ИНН "+str[0] + " КПП "+str[1]);*/
        }



     //   System.out.println("text konverter "  );

    }
}

