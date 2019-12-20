
//добавить цвет, + рандомность
public class Sleep {

    public static int i= 0;

    public static void main(String[] args) throws InterruptedException {
        // запоминаем текущее время в миллисекундах
        long start = System.currentTimeMillis();
        // останавливаем основной поток программы на 2000 миллисекунд (2 секунды)
    //    Thread.sleep(1000);
      //  System.out.println("Выполнение программы приостановлено на = " + (System.currentTimeMillis() - start));



        while (true) {


         Thread.sleep(100); ;

        System.out.println("Tick Tock " + i) ;

            Thread.sleep(300);
            System.out.print("П");

            Thread.sleep(300);
            System.out.print("Р");
            Thread.sleep(300);
            System.out.print("И");
            Thread.sleep(300);
            System.out.print("В");
            Thread.sleep(300);
            System.out.print("Е");
            Thread.sleep(300);
            System.out.print("Т");
            Thread.sleep(300);
            System.out.print("!");
            i++;
        

        }

    }

}