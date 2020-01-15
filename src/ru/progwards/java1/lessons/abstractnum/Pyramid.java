package ru.progwards.java1.lessons.abstractnum;

public class Pyramid extends Figure3D{



    public Pyramid(Number segment) {
        super(segment);
    }

    @Override
    public Number volume(){
//формуле Segment*Segment*Segment/3
        //это высота

        //как поделить на 3?
       return (segment.mul(segment.mul(segment)))  ;

//Integer a = segment.mul(segment.mul(segment)) ; //не выходит





      //  return null;
    }
}

/*6 Реализовать класс Pyramid, переопределяющий метод
public Number volume(), который будет возвращать объем пирамиды, с основанием квадрат, и высотой равной стороне квадрата по формуле Segment*Segment*Segment/3;*/