package Warehouse.dump.java1.SeaBattle.seabattle_999;

import ru.progwards.java1.SeaBattle.SeaBattle;
import ru.progwards.java1.SeaBattle.SeaBattle.FireResult;

public class SeaBattle_999 {

    private static char field[][] = new char[' '][' '];  //поле пустое

    //static Character empty = '?';


    private SeaBattle seaBattle;  // seaBattle, что бы не таскать его везде параметром

    enum State {  //состояние поля
        EMPTY,    // пустое
        OBJECT,      //ship или объект /SHIP
        MARK,      //метка или заметка
    }


    public void battleAlgorithm(SeaBattle seaBattle) {
        int hits = 0;
        for (int y = 0; y < seaBattle.getSizeX(); y++) {
            for (int x = 0; x < seaBattle.getSizeY(); x++) {
                SeaBattle.FireResult fireResult = seaBattle.fire(x, y);

                if (fireResult != FireResult.MISS) {
                hits++;
                }


                if(fireResult == FireResult.DESTROYED) {

                      if(fireResult != FireResult.MISS){


                      }
                }


                if (hits >= 20)
                    return;
            }
        }
    }

    static void testFull() {
        System.out.println("Sea battle");
        double result = 0;
        for (int i = 0; i < 1000; i++) { //для создании 1000 новых полей
            SeaBattle seaBattle = new SeaBattle();
            new SeaBattle_999().battleAlgorithm(seaBattle);
            result += seaBattle.getResult();
            // System.out.println(seaBattle); //вывод поля
        }
        System.out.println(result / 1000);
    }

    static void testOne() {
        System.out.println("Sea battle");
        SeaBattle seaBattle = new SeaBattle(true); //false или пустое(поле) будет создаваться новое поле, со случайной раскладкой кораблей
        new SeaBattle_999().battleAlgorithm(seaBattle);
        System.out.println(seaBattle.getResult());
        System.out.println(seaBattle); //вывод поля

    }

    // функция для отладки
    public static void main(String[] args) {
        //testFull();
        testOne();
    }
}
