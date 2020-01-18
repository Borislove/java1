package Warehouse;

import java.util.Arrays;

public class ArraysPractic {
    public static void main(String[] args) {

        int[] a = {213, 666, 778, 3123, 0, -2323, -543425, 0, -336};
        System.out.println(Arrays.toString(a));   //вызвать Arrays потом к toString , затем сам массив
        //  System.out.println(java.util.Arrays.toString(a));  //можно так

        //     Arrays.sort(a);    //сортируем массив
        System.out.println(Arrays.toString(a));  //

      //  System.out.println(a.equals(a));

        int[] aCopyClone = a.clone();  //клонировали
        System.out.println("Clone " + Arrays.toString(aCopyClone));

        //int[] aCopy = a;
        int[] aCopy = Arrays.copyOf(a, a.length);  //скопировали

        System.out.println("Copy " + Arrays.toString(aCopy));
        System.out.println(aCopy.equals(aCopyClone));  //false
        System.out.println(aCopy.equals(a));  //false
        System.out.println(a.equals(aCopy)); //false
        System.out.println(a.equals(aCopyClone)); //false

        /*aCopy[2] = 123456;
        System.out.println(Arrays.toString(aCopy));*/

        Arrays.sort(aCopy);
        System.out.println(Arrays.toString(aCopy));
        //System.out.println(aCopy.equals(Arrays.sort(aCopy) )) ;  //так не работает

        //int[] aCopySort = Arrays.sort(aCopy); // тоже нельзя...
      //  Integer[] aCopySort = Arrays.sort(aCopy);


        int[] aCopy2 = Arrays.copyOf(a,a.length);
        aCopy2[0] = -1111111; //присвоили индексу 0 значение
        Arrays.sort(aCopy2);
        if(aCopy2[0]==-1111111){   //если в индексе есть это число то надо заменить
            aCopy2[0]=22222;
            //System.out.println(Arrays.toString(aCopy2));
        }
        System.out.println(Arrays.toString(aCopy2));
        Arrays.sort(aCopy2);
        System.out.println(Arrays.toString(aCopy2));

       // Arrays.sort(aCopy2);
        System.out.println("Поиск "+ Arrays.binarySearch(aCopy2, 213));
        System.out.println("Поиск "+ Arrays.binarySearch(aCopy, 213));
        aCopy[5]  = 214;
        System.out.println("Поиск "+ Arrays.binarySearch(aCopy, 213));
        System.out.println(Arrays.toString(aCopy));
        System.out.println("Поиск "+ Arrays.binarySearch(aCopy, 0)); // показывает на одно месторасположение

        System.out.println("Поиск "+ Arrays.binarySearch(aCopy, 213212321));  //Поиск -10 , если нет такого значения вообще, где он ищет то

    }
}
