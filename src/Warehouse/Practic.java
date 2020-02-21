package Warehouse;

import java.util.Arrays;

// TODO: 02.02.2020 попытался...сам пусть сделает на своем VBA

public class Practic {


            //7801678586\780101001 ООО "Рога и Копыта" превращался в ООО Рога и Копыта ИНН 7801678586 КПП 780101001

    public static void main(String[] args) {


       // String original = "7801678586\\780101001 ООО \"Рога и Копыта\""  ;

       // String original = "7801678586\\780101001 ООО \"Рога и Копыта\""  ;

        //original.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+");
        //original.split( " [ ]" ) ;

         //original.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+");




      /*  String[] strOrig ;
        String razdelitel = " " ;
        //String razdelitel2 = "\\\\" ;
        strOrig = original.split(razdelitel);
        System.out.println(Arrays.toString(strOrig));*/

/*

        String[] strSlash;
        String razdelitelSlash = "\\\\";
        strSlash = original.split(razdelitelSlash);
        System.out.println("слеш"+Arrays.toString(strSlash));

        String newtext = Arrays.toString(strSlash);
        System.out.println(newtext);
        strSlash = newtext.split("\\\"");
        System.out.println(Arrays.toString(strSlash));
        strSlash = newtext.split("ООО");
        System.out.println(Arrays.toString(strSlash));
*/



//------------------------------------------------------------

        String texttext = "7801678586\\780101001 ООО \"Рога и Копыта\"";
        String[] arraytext = texttext.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String current : arraytext) {
            builder.append(current);
        }
        String newtext12 = builder.toString();
        System.out.println(newtext12);



       /* String array = strSlash[strSlash.length];
        System.out.println(array);*/
        //
/*

        String[] strKavi4ka;
        String razdelitelKavi4ka = "\\\"";
        strKavi4ka = original.split(razdelitelKavi4ka);
        System.out.println("кавычка"+Arrays.toString(strKavi4ka));*/

//        for(int i = 0; i < strOrig.length; i++) {
         //   System.out.println(strOrig[i]);
            //System.out.println(Arrays.toString(strOrig));
  //      }
  /*      System.out.println(Arrays.toString(strOrig));

     //   System.out.println(original);
        //System.out.println(strOrig[1]+" "+strOrig[2]+" "+strOrig[3]+" "+strOrig[4] + " "+strOrig[0]);

        System.out.print(strOrig[1]+" ");
        System.out.print(strKavi4ka[1]+" ");
        System.out.println("ИНН "+strSlash[0]+ " КПП "+strSlash[1]);
*/




       /* String[] arrayiCopy = Arrays.copyOf(strSlash,strSlash.length);
        System.out.println(Arrays.toString(arrayiCopy));
        String[] arrayiCopy2 = Arrays.copyOf(arrayiCopy,arrayiCopy.length);

*/

     //   original.split( "[ ]*[\\\"]*[ ]" ) ;
      /*  System.out.println(original);
        String[] array;*/
      //array = original.split("[[ ]*|[,]*|[\\.]*|[:] * |[/]*|[!]*|[?]*|[+]*]+");
//        array = original.split( " [ \\\"]*|[ \\\"\\\"]") ;
        //array = original.split( " [ ]*|[ \\\"\\\"]") ; //убрал кавычки
    //  array = original.split( " [ ]*|[ \\\"\\\"]*|[\\\\]") ; //разбилось все

      //  array = original.split( "[ \\\"\\\"] ") ; //убрал кавычки

      //  System.out.println(Arrays.toString(array));


    }
}
