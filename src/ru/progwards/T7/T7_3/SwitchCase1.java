package ru.progwards.T7.T7_3;

//Пример с оператором break
public class SwitchCase1 {
    public static void main(String[] args) {
        int value = 3;

      /*  switch (value) {
            case 1:
                System.out.println("Выбран case 1");
                break;
            case 2:
                System.out.println("Выбран case 2");
                break;
            case 3:
                System.out.println("Выбран case 3");
                break;
            case 4:
                System.out.println("Выбран case 4");
                break;
            case 5:
                System.out.println("Выбран case 5");
                break;
            default:
                System.out.println("Выбран default");*/

        //-----------------------------------------------------
        //Тот же пример без оператора break
        //-----------------------------------------------------
        switch (value) {
            case 1:
                System.out.println("Выбран case 1");
            case 2:
                System.out.println("Выбран case 2");
            case 3:
                System.out.println("Выбран case 3");
            case 4:
                System.out.println("Выбран case 4");
            case 5:
                System.out.println("Выбран case 5");
            default:
                System.out.println("Выбран default");
        }
    }
}
