package Warehouse.lost;

//вроде получилось...
/*
даны 3 числа, когда выпадают 3 рандомных числа выкидывать их и сохранять результат...наверно в коллекциях проще
булевы  тоже надо когда нибудь применить...
 *
 * */
public class Lost {

    private static int a = 26;
    private static int b = 2;
    private static int c = 13;

    private static int result = 0;

    private final static int OVER = a + b + c;  //пока без суммы

    private static int aa = 1; // Начальное значение диапазона - "от"
    private static int bb = 26; // Конечное значение диапазона - "до"

    public static void main(String[] args) throws InterruptedException {

        int value = 0;
        int test = 0;
        int test1 = 0;
        int test2 = 0;

        while (true) {

            Thread.sleep(200);

            //int value = 0;
            System.out.println("Итерация " + value);

            int random_number1 = aa + (int) (Math.random() * bb); // Генерация
            System.out.println("Рандомное число " + random_number1);

            if (test == 0) {
                if (random_number1 == a) {
                    System.out.println("Выпало число" + " 26" + " == " + a);     //заменить 26
                    result += a;
                    bb = 25;  //делал так чтоб не попадало в диапозон, вроде сработало, но пришлось условия...
                    test++;
                }
            }
            if (test1 == 0) {
                if (random_number1 == b) {
                    System.out.println("Выпало число" + " 2" + " == " + b);
                    //break;
                    result += b;
                    aa = 2;
                    test1++;
                }
            }
            if (test2 == 0) {
                if (random_number1 == c) {
                    System.out.println("\u001B[31m" + "Выпало число" + " 13" + " == " + "\u001B[0m" + c);
                    //break;
                    result += c;
                    test2++;
                }
            }
            System.out.println("\u001B[32m" + "result " + "\u001B[0m" + result);

            if (result == 41) {
                System.out.println("OVER " + result);
                System.out.println(" a = " + a + " b =  " + b + " c = " + c);
                break;
            }
            value++;
        }
    }
}