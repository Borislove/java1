package Warehouse.dump.java1.SeaBattle.seabattlealg_default;

import ru.progwards.java1.SeaBattle.SeaBattle;
import ru.progwards.java1.SeaBattle.SeaBattle.FireResult;

// TODO: 01.02.2020 Так выглядит оригинал

class SeaBattleAlg_Default {

    public void battleAlgorithm(SeaBattle seaBattle) {  //~104.526
        // пример алгоритма:
        // стрельба по всем квадратам поля полным перебором
        int hits = 0;
        for (int y = 0; y < seaBattle.getSizeX(); y++) {
            for (int x = 0; x < seaBattle.getSizeY(); x++) {
                SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                if (fireResult != FireResult.MISS)
                    hits++;
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
            new SeaBattleAlg_Default().battleAlgorithm(seaBattle);
            result += seaBattle.getResult();
            // System.out.println(seaBattle); //вывод поля
        }
        System.out.println(result / 1000);
    }

    static void testOne() {
        System.out.println("Sea battle");
        SeaBattle seaBattle = new SeaBattle(true); //false или пустое(поле) будет создаваться новое поле, со случайной раскладкой кораблей
        new SeaBattleAlg_Default().battleAlgorithm(seaBattle);
        System.out.println(seaBattle.getResult());
        System.out.println(seaBattle); //вывод поля

    }

    // функция для отладки
    public static void main(String[] args) {
        testFull();
    }
}