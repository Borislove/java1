package com.javarush.level01;


//Сегодня я проведу для тебя три занятия. А это – второе! Садись и слушай, и я расскажу тебе о выводе на экран. Это очень легко и просто:
public class lecture07 {


    public static void main(String[] args) {

        System.out.println("Diego"); //Diego
        System.out.println(3);  //3
        System.out.println("Mama" + "Mila" + "Ramu"); //MamaMilaRamu

        System.out.println(1 + 3);  //4
        System.out.println("1" + "3"); //13
        System.out.println(1 + "3"); //13
        System.out.println("1" + 3); //13
        System.out.println("1" + (1 + 3)); //14

        System.out.println("Amigo is the best!"); //Amigo is the best!
        System.out.println("Amigo" + "is the best!"); //Amigois the best!
        System.out.println("Amigo" + " " + "is the best!"); // Amigo is the best!

        System.out.println(3 * 3 + 4 * 4); //24
        System.out.println(1 * 2 + 3 * 4); //14

        System.out.print("Diego");
        System.out.print("Diego");
        System.out.print("Diego");  //DiegoDiegoDiego

        System.out.print("Diego ");
        System.out.println("is the best!");   //Diego is the best!
        System.out.print("Amigo ");
        System.out.println("is the best!");  //Amigo is the best!
    }
}
