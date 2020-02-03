package Warehouse.kbv1219.Person;


/*Создайте класс Person, содержащий

приватную переменную String name;
приватную переменную int age;
приватную переменную String country;
конструктор по умолчанию, устанавливающий country = "RU";
конструктор с параметрами String name, int age, вызывающий конструктор по умолчанию, и устанавливающий значения переменным name и age из соответствующих параметров;
публичные функции String getName(), int getAge(), String getCountry(), возвращающие значения соответствующих переменных*/

class Person {

/*    Person person = new Person() {

    } */

    private String name = "vasya";
    private int age = 21;
    private String country;


    public Person getTest() {

        getAge(age);
        getName(name);

        return this;
    }

    void country(String s) {
        country = "RU";
    }

    public void getTest(String name, int age) {

        //System.out.println(getName(name) + getAge(age));
        //return;
        //System.out.println(person.getName(this.name));
        //System.out.println(getName());
        getName(name);
        getAge(age);
    }

    public String getName(String name) {
        this.name = name;
        System.out.println(name);
        return name;
    }

    public int getAge(int age) {
        this.age = age;
        System.out.println(age);
        //System.out.println(person.getAge(this.age));
        return age;
    }

    public String getCountry(String country) {
        this.country = country;
        System.out.println(country);
        //  System.out.println(person.getCountry(this.country));
        return country;
    }

}

