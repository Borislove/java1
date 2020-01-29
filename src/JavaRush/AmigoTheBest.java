package JavaRush;

//— Если ты пишешь команду System.out.println() несколько раз, то каждый раз переданный в нее текст будет выводиться с новой строки.
// Если System.out.print(), то текст будет выдаваться на той же строке. Пример:

//— Небольшое замечание. Команда println не выводит текст с новой строки — она выводит текст на текущей строке, но делает так, чтобы следующий текст выводился на новой строке.
//— Команда println() выводит на экран текст и затем добавляет специальный невидимый «символ перевода строки», в результате чего следующий текст будет отображаться с начала новой строки.


public class AmigoTheBest {
    public static void main(String[] args) {
        //------------------------------------
        System.out.println("Amigo");
        System.out.println("The");
        System.out.println("Best");
        System.out.println("");
        //------------------------------------
        System.out.print("Amigo");
        System.out.println("The");
        System.out.print("Best");
        System.out.println("");
        //------------------------------------
        System.out.print("Amigo");
        System.out.print("The");
        System.out.print("Best");

    }
}


