package Warehouse.dump.java1.SeaBattle.seabattlealg_1;


import ru.progwards.java1.SeaBattle.SeaBattle;

public class SeaBattleAlg_1 {

    public static int number = 1; //счетчик попыток

    private static final int MINUS = 0b01; //стреляем в уменьшение координаты
    private static final int PLUS = 0b10; //стреляем в увеличение координаты

    public static boolean printField = false; //печатать поле на каждом шаге
    char[][] field; //поле боя. ' ' - пустая ячейка, '*' - выстрел, 'X' - попали в корабль, '.' - отметили , что нет смысла стрелять
    SeaBattle seaBattle; // seaBattle, что бы не таскать его везде параметром
    int hits; //общее количество попаданий
    int direction; //направление стрельбы - PLUS | MINUS


    //------------------------------------------Рабочий с текстом-----------------------------------

   /* public void battleAlgorithm123(SeaBattle seaBattle) {
        int hits = 20;
        //for (int x=0,y=0 ;  y < seaBattle.getSizeX() || x < seaBattle.getSizeY() ; y++ , x++) { // по диагонали
        for (int y = 0; y < seaBattle.getSizeX(); y++) {
            for (int x = 0; x < seaBattle.getSizeY(); x++) {
                SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                if (fireResult == FireResult.HIT) {
                    //seaBattle.fire(x,y);
                    //  seaBattle.getSizeY();
                    // seaBattle.getSizeX();
                    //FireResult.HIT;
                    System.out.println("\u001B[31m" + "Попадание! " + "\u001B[0m" + "Победа близка");
                    System.out.println("Координаты x = " + x + " Координаты y = " + y);
                    System.out.println("-----------------------------------");
                    //seaBattle.fire(seaBattle.getSizeX(),seaBattle.getSizeY());
//                    seaBattle.fire( ((x+1 &x)|(x-1&x)),y+1&y|y-1&y);
                    fireResult = FireResult.HIT;
                    //  fireResult = FireResult.MISS;
                }
                if (fireResult == FireResult.DESTROYED) {

                    fireResult = FireResult.DESTROYED;
                }
                if (fireResult != FireResult.MISS)
                    hits--;
                System.out.print("Промах  ");
                System.out.println("Координаты x = " + x + " Координаты y = " + y);
                System.out.println("-----------------------------------");
                if (hits == 0)      //20 кораблей?
                    //  System.out.println("Кораблей больше нет! Остались утки");
                    return;
            }
        }
    }*/

    //------------------------------------------ тест-----------------------------------
  /*  public void battleAlgorithm(SeaBattle seaBattle) {
        int hits = 20;
int x = 7;
int y = 0;

        SeaBattle.FireResult fireResult = seaBattle.fire(x,y);
        if(fireResult == FireResult.HIT);


            System.out.println("x "+x+ " y "+y );

            //seaBattle.fire(x+1,0);
            if(fireResult == FireResult.MISS);
           // seaBattle.fire( x-1 ,y);
            //seaBattle.fire(x,y+1);

       // seaBattle.fire(7,0);

        //seaBattle.fire(6,0);
        //seaBattle.fire(8,0);
    }*/

    //---------------------------------------------
    public void battleAlgorithm(SeaBattle seaBattle) throws InterruptedException {

        // searchShip4(seaBattle);
        //  searchShip3(seaBattle);
        //   searchShip2(seaBattle);
        searchShip1(seaBattle);

    }


    public void searchShip4(SeaBattle seaBattle) throws InterruptedException {    //поиск 4 палубного корабля

        int x = 3;
        int y = 0;

        SeaBattle.FireResult fireResult = seaBattle.fire(x, y);

        fireResult = seaBattle.fire(2, 1);
        fireResult = seaBattle.fire(1, 2);
        fireResult = seaBattle.fire(0, 3);
//-------------------------------------------------------
        fireResult = seaBattle.fire(6, 9);
        fireResult = seaBattle.fire(7, 8);
        fireResult = seaBattle.fire(8, 7);
        fireResult = seaBattle.fire(9, 6);
//-------------------------------------------------------
        fireResult = seaBattle.fire(9, 2);
        fireResult = seaBattle.fire(8, 3);
        fireResult = seaBattle.fire(7, 4);
        fireResult = seaBattle.fire(6, 5);
        fireResult = seaBattle.fire(5, 6);
        fireResult = seaBattle.fire(4, 7);
        fireResult = seaBattle.fire(3, 8);
        fireResult = seaBattle.fire(2, 9);
//-------------------------------------------------------
        fireResult = seaBattle.fire(7, 0);
        fireResult = seaBattle.fire(6, 1);
        fireResult = seaBattle.fire(5, 2);
        fireResult = seaBattle.fire(4, 3);
        fireResult = seaBattle.fire(3, 4);
        fireResult = seaBattle.fire(2, 5);
        fireResult = seaBattle.fire(1, 6);
        fireResult = seaBattle.fire(0, 7);
    }

    public void searchShip3(SeaBattle seaBattle) { //поиск 3 палубного

        int x = 9;
        int y = 4;
        SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
        //-------------------3----------- низ----------------
        //fireResult = seaBattle.fire(9, 4);
        fireResult = seaBattle.fire(8, 5);
        fireResult = seaBattle.fire(7, 6);
        fireResult = seaBattle.fire(6, 7);
        fireResult = seaBattle.fire(5, 8);
        fireResult = seaBattle.fire(4, 9);
        //-------------------3----------- верх----------------
        fireResult = seaBattle.fire(5, 0);
        fireResult = seaBattle.fire(4, 1);
        fireResult = seaBattle.fire(3, 2);
        fireResult = seaBattle.fire(2, 3);
        fireResult = seaBattle.fire(1, 4);
        fireResult = seaBattle.fire(0, 5);
        //---------углы
        fireResult = seaBattle.fire(9, 9);
        fireResult = seaBattle.fire(0, 0);
        //-------------------3-----------centre----------------
        //fireResult = seaBattle.fire(0,9);   //+2
        fireResult = seaBattle.fire(1, 8);
        fireResult = seaBattle.fire(2, 7);
        fireResult = seaBattle.fire(3, 6);
        fireResult = seaBattle.fire(4, 5);
        fireResult = seaBattle.fire(5, 4);
        fireResult = seaBattle.fire(6, 3);
        fireResult = seaBattle.fire(7, 2);
        fireResult = seaBattle.fire(8, 1);


    }

    public void searchShip2(SeaBattle seaBattle) {  //поиск 2 палубного
        int x = 0;
        int y = 9;
        SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
        //-------------------2---------------------------
        //fireResult = seaBattle.fire(0,9);   //+2
        fireResult = seaBattle.fire(9, 0);   //+2

        fireResult = seaBattle.fire(0, 1);
        fireResult = seaBattle.fire(1, 0);

        fireResult = seaBattle.fire(8, 9);
        fireResult = seaBattle.fire(9, 8);
    }

    public void searchShip1(SeaBattle seaBattle) {   //поиск 1 палубного
        int x = 2;
        int y = 0;
        SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
//------------------1---------------------------
        // fireResult = seaBattle.fire(2,0);
        fireResult = seaBattle.fire(1, 1);
        fireResult = seaBattle.fire(0, 2);
        //--------------
        fireResult = seaBattle.fire(9, 7);
        fireResult = seaBattle.fire(8, 8);
        fireResult = seaBattle.fire(7, 9);
        //--------------
        fireResult = seaBattle.fire(9, 3);
        fireResult = seaBattle.fire(9, 5);
        fireResult = seaBattle.fire(8, 4);
        fireResult = seaBattle.fire(8, 6);
        fireResult = seaBattle.fire(7, 5);
        fireResult = seaBattle.fire(7, 7);
        fireResult = seaBattle.fire(6, 6);
        fireResult = seaBattle.fire(6, 8);
        fireResult = seaBattle.fire(5, 7);
        fireResult = seaBattle.fire(5, 9);
        fireResult = seaBattle.fire(4, 8);
        fireResult = seaBattle.fire(3, 9);
        //--------------
        fireResult = seaBattle.fire(4, 0);
        fireResult = seaBattle.fire(6, 0);
        fireResult = seaBattle.fire(3, 1);
        fireResult = seaBattle.fire(5, 1);
        fireResult = seaBattle.fire(2, 2);
        fireResult = seaBattle.fire(4, 2);
        fireResult = seaBattle.fire(3, 3);
        fireResult = seaBattle.fire(1, 3);
        fireResult = seaBattle.fire(2, 4);
        fireResult = seaBattle.fire(0, 4);
        fireResult = seaBattle.fire(1, 5);
        fireResult = seaBattle.fire(0, 6);
        //--------------остатки в центре
        fireResult = seaBattle.fire(0, 8);
        fireResult = seaBattle.fire(1, 7);
        fireResult = seaBattle.fire(2, 6);
        fireResult = seaBattle.fire(3, 5);
        fireResult = seaBattle.fire(4, 4);
        fireResult = seaBattle.fire(5, 3);
        fireResult = seaBattle.fire(6, 2);
        fireResult = seaBattle.fire(7, 1);
        fireResult = seaBattle.fire(8, 0);

        fireResult = seaBattle.fire(9, 1);
        fireResult = seaBattle.fire(8, 2);
        fireResult = seaBattle.fire(7, 3);
        fireResult = seaBattle.fire(6, 4);
        fireResult = seaBattle.fire(5, 5);
        fireResult = seaBattle.fire(4, 6);
        fireResult = seaBattle.fire(3, 7);
        fireResult = seaBattle.fire(2, 8);
        fireResult = seaBattle.fire(1, 9);
    }

    static void sleepFire() throws InterruptedException { //спать после выстрела
        Thread.sleep(300);
    }


    static void testFull() throws InterruptedException {  //полный тест
        System.out.println("Sea battle");
        double result = 0;

        //---------------------Test-------------------------
        for (int i = 0; i < 1000; i++) {  //1000

            System.out.println("ORIGINAL Количество попыток: " + number);

            SeaBattle seaBattle = new SeaBattle();
            //   SeaBattle seaBattle = new SeaBattle(true); //игровое поле, создается тестовое поле, false или пустое новая раскладка кораблей

            //new SeaBattleAlg().battleAlgorithm(seaBattle);


            System.out.println(seaBattle); //раскладка кораблей
            result += seaBattle.getResult();
            number++;
        }

        System.out.println(result / 1000);

    }

    static void testOne() throws InterruptedException {   //тестовое поле
        System.out.println("Sea battle");
        SeaBattle seaBattle = new SeaBattle(true); //игровое поле, создается тестовое поле, false или пустое новая раскладка кораблей
        //new SeaBattleAlg().battleAlgorithm(seaBattle);
        new SeaBattleAlg_1().battleAlgorithm(seaBattle);
        System.out.println(seaBattle.getResult());
        System.out.println("тестовое поле");
        System.out.println("----------------------------");
        System.out.println(seaBattle);
    }

    // функция для отладки
    public static void main(String[] args) throws InterruptedException {
        //   testFull();  //полный тест в 1000 итераций
        testOne();  //тестовое поле тест
    }
}

