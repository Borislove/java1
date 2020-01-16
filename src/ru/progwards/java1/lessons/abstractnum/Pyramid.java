package ru.progwards.java1.lessons.abstractnum;

public class Pyramid extends Figure3D{



    public Pyramid(Number segment) {
        super(segment);
    }


    //-------------------------------------------------------------
    //формуле Segment*Segment*Segment/3
    //-------------------------------------------------------------


    @Override
    public Number volume(){

        Integer number = 3;

// TODO: 16.01.2020 Очень просто...осталось тут решить
        //как поделить на 3?

        //return (segment.mul(segment.mul(segment)) \ number)  ; //не работает

        return (segment.mul(segment.mul(segment)) )  ;

      //  return null;
    }
}

/*6 Реализовать класс Pyramid, переопределяющий метод
public Number volume(), который будет возвращать объем пирамиды, с основанием квадрат, и высотой равной стороне квадрата по формуле Segment*Segment*Segment/3;*/