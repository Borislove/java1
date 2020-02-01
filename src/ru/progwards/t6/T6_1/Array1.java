package ru.progwards.t6.T6_1;

//размер одного массива
public class Array1 {
    public static void main(String[] args) {

        int[] simpleArray1 = { 21,34,55,89,144};
        int simpleArray2[] = {144,34,55,89,21};
        int[] simleArray3 = new int[5];
        String [] stringArray1 = new String[5];
        String [] stringArray2= {"мне", "всё", "понятно"};

        System.out.println("simpleArray1.lenght = "+simpleArray1.length);
        System.out.println("stringArray1.lenght = "+stringArray1.length);
        System.out.println("stringArray2.lenght = "+stringArray2.length);
    }
}
