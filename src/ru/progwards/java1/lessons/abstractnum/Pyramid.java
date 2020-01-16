package ru.progwards.java1.lessons.abstractnum;

public class Pyramid extends Figure3D{




    public Pyramid(Number segment) {
        super(segment);
    }


    //-------------------------------------------------------------
    //формуле Segment*Segment*Segment/3
    //-------------------------------------------------------------


   /*
    public Number newNumber(String strNum){


        return null;
    }
    */

    @Override
    public Number volume(){

        //Integer number = 3;
       // int number =3;

        //int strNum = 3;

// TODO: 16.01.2020 Очень просто...осталось тут решить
        //как поделить на 3?

           //      return (segment.mul(segment.mul(segment)) )   ;   // ok

     //  return (segment.mul(segment.mul(segment)) / segment.newNumber(Integer.valueOf(number))   ;

        //return     (segment.mul(segment.mul(segment))  /  (segment.mul(segment.mul(segment)))   ;

        //        return (segment.mul(segment.mul(segment)) )  / segment.newNumber(number) ;

    //number = ((int) (segment.mul(segment.mul(segment))    )) ;


       // Integer test = Integer.valueOf(segment.mul(segment.mul(segment))) ;



         //return segment.mul(segment.mul(segment))  / segment ;

//        return segment.mul(segment.mul(segment)) /  segment.newNumber(3.0) ;

        //return (segment.mul(segment.mul(segment)) /  (segment.newNumber(3.0))) ;


//        return (segment.mul(segment.mul(segment)) /  (segment.newNumber(3.0))) ;

        //return new DoubleNumber(value/((DoubleNumber)num).value);   // пример


        return (segment.mul(segment.mul(segment)))  ;


        //return null;
    }
}

/*6 Реализовать класс Pyramid, переопределяющий метод
public Number volume(), который будет возвращать объем пирамиды, с основанием квадрат, и высотой равной стороне квадрата по формуле Segment*Segment*Segment/3;*/


// TODO: 16.01.2020 ERROR: Тест "Класс Pyramid, метод volume()" не пройден. Метод volume() возвращает неверное значение после
//  создания экземпляра объекта с входным параметром new IntNumber(786). Возвращен результат: 485587656, ожидался: 161862552

// TODO: 16.01.2020 Подсказка: можно воспользоваться вашей функцией newNumber