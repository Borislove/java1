package ru.progwards.java1_2.lessons.io2;

/*Задача 1. Класс PhoneNumber
Создать статический метод public static String format(String phone), который форматирует телефон под формат +7(999)111-2233, входящий формат может быть различным:
- 79991112233
- 8(999)111-22-33
- 8 999 111 22 33

формальное задание на форматирование:
- выделить все цифры, отбросить все разделители
- проверить что цифр в номере 11 или 10, в противном случае выбросить исключение
- убрать спереди 8
- добавить, если нужно +7
- отформатировать под выходной шаблон*/

// TODO: 04.07.2020 Вначале сделать проверку если 11 цифр ок, если нет выйти
public class PhoneNumber {

    public static String format(String phone) {

        char[] phoneArray = phone.toCharArray();  //строку в массив

        String str = "";   //ячейка для сохранения char

        int counter = 0;   //счетчик

        //проверка на символы
        for (char c : phoneArray) {
            if (Character.isDigit(c)) {
                //   System.out.print(c);
                //str = String.valueOf(c);
                str += c;
                counter++;

            }
        }
        System.out.println("");

        if (counter != 11) {
            throw new RuntimeException("Неправильный номер");
        }

        //str.substring(1);

        StringBuilder stringBuilder = new StringBuilder("+7");  //в начале будет +7
        stringBuilder.append(str.substring(1));   //чтение строки с 1 индекса и добавление +7

        //str.substring(0);
        StringBuffer sb = new StringBuffer(stringBuilder);

        //вставим символы в индексы
        sb.insert(2, "(");

        sb.insert(6, ")");

        sb.insert(10, "-");

        System.out.println(sb);

        //  System.out.println(stringBuilder.length());

        //  System.err.println("counter:" + counter);

        //  System.out.print("length buffer:");
        //   System.out.println(sb.length());

        return sb.toString();
        //return stringBuilder.toString();  //заглушка
    }

    public static void main(String[] args) {
        format("79991112233");
        format("8(999)111-22-33");
        format("8 999 111 22 33");
        format("123()3123)23(1)2");
        format("123**3123s2h(1,2///...6");
        format("73314759721");

        //  System.out.println(format("2111111111123123123zz..."));
        System.out.println("+7(999)111-2233");

        format("7(151)190-98-24");
    }
}

