package ru.progwards.T7;

public class Grade {


enum grade {

    VERYBAD,
    BAD,
    SATISFACTORILY,
    GOOD,
    EXCELLENT,
    NOTDEFINED

}


    static Grade intToGrade(int grade){

         //Grade.grade =

//        Grade.grade
        switch(grade) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

                default:

        }


        return null;
    }



    public static void main(String[] args) {
        intToGrade(4);
    }
}


/*Создайте метод, возвращающий значение enum Grade по числовой оценке.
Сигнатура метода static Grade intToGrade(int grade)

Соответствие оценок

1 - VERYBAD
2 - BAD
3 - SATISFACTORILY
4 - GOOD
5 - EXCELLENT
все остальное NOTDEFINED

Например, intToGrade(4) должно вернуть GOOD

*/