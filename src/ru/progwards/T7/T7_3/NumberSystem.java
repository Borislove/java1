package ru.progwards.T7.T7_3;

//представление числа в произвольной системе счисления с базой от 2 до 16включительно
public class NumberSystem {
    //получение цифры в строков представлении по числу от 0 до 15
    public static String val2Digit(int val) {
        return null;
    }


    //преобразование числа val к виду в системе счисления с основанием base
    public static String show(int val, int base) {   //функция show - показать
        String result = "";
        while (val>0) {
            int remainder = val % base;
            result = val2Digit(remainder) + result;
        }
        if(result.isEmpty())
            return "0";
        //return null;
        return result;

    }

    public static void main(String[] args) {
        int value = 25;
        System.out.println("Десятичная система: " + value);
        System.out.println("Двоичная система: " + NumberSystem.show(value,2));
        System.out.println("Шестнадцатиричная система: " + NumberSystem.show(value,16));
    }
}
