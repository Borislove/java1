package ru.progwards.java1.SeaBattle.abirme;

import ru.progwards.java1.SeaBattle.SeaBattle;
import ru.progwards.java1.SeaBattle.SeaBattle.FireResult;

    public class SeaBattleAlg {
        // Тестовое поле создаётся конструктором
        //     SeaBattle seaBattle = new SeaBattle(true);
        //
        // Обычное поле создаётся конструктором по умолчанию:
        //     SeaBattle seaBattle = new SeaBattle();
        //     SeaBattle seaBattle = new SeaBattle(false);
        //
        // Посомтреть результаты стрельбы можно в любой момент,
        // выведя объект класса SeaBattle на консоль. Например так:
        //     System.out.println(seaBattle);
        //
        //
        // Вид тестового поля:
        //
        //           0 1 2 3 4 5 6 7 8 9    координата x
        //         0|.|.|.|.|.|.|.|X|.|.|
        //         1|.|.|.|.|.|X|.|.|.|.|
        //         2|X|X|.|.|.|.|.|.|.|.|
        //         3|.|.|.|.|.|.|.|X|X|X|
        //         4|.|.|.|.|X|.|.|.|.|.|
        //         5|.|.|.|.|X|.|.|Х|.|.|
        //         6|.|.|.|.|.|.|.|Х|.|X|
        //         7|X|.|X|.|.|.|.|Х|.|X|
        //         8|X|.|.|.|.|.|.|X|.|.|
        //         9|X|.|.|.|X|.|.|.|.|.|

        public void battleAlgorithm(SeaBattle seaBattle) {
            // пример алгоритма:
            // стрельба по всем квадратам поля полным перебором
            int hits = 0;
            for (int y = 0; y < seaBattle.getSizeX(); y++) {
                for (int x = 0; x < seaBattle.getSizeY(); x++) {
                    SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
                    if(fireResult != FireResult.MISS)
                        hits++;
                    if(hits>= 20)   //20 кораблей?
                        return;
                }
            }
        }

        static void testFull(){
            System.out.println("Sea battle");
            double result = 0 ;
            for (int i = 0; i < 1000 ; i++) {
         //   SeaBattle seaBattle = new SeaBattle(true); //игровое поле, создается тестовое поле, false или пустое новая раскладка кораблей
                SeaBattle seaBattle = new SeaBattle();
            new SeaBattleAlg().battleAlgorithm(seaBattle);
            result +=seaBattle.getResult();
            }
            System.out.println(result/1000);
        }

        static void testOne(){
            System.out.println("Sea battle");
            SeaBattle seaBattle = new SeaBattle(true); //игровое поле, создается тестовое поле, false или пустое новая раскладка кораблей
            new SeaBattleAlg().battleAlgorithm(seaBattle);
            System.out.println(seaBattle.getResult());
        }

        // функция для отладки
        public static void main(String[] args) {
            testFull();

        }
    }



/*Реализовать алгоритм стрельбы для Морского боя. Для этого:

1. Реализовать класс SeaBattleAlg
2. В классе реализовать метод  public void battleAlgorithm(SeaBattle seaBattle)
В методе реализовать максимально оптимальный алгоритм стрельбы для уничтожения кораблей.

Для выстрела использовать SeaBattle.FireResult seaBattle.fire(int x, int y)

Тестовое поле создаётся конструктором
SeaBattle seaBattle = new SeaBattle(true);


Обычное (случайное) поле создаётся конструктором по умолчанию:
SeaBattle seaBattle = new SeaBattle();
или
SeaBattle seaBattle = new SeaBattle(false);

Посмотреть результаты стрельбы можно в любой момент,
выведя объект класса SeaBattle на консоль. Например так:
System.out.println(seaBattle);*/