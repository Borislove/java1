package Warehouse.books.kettle.mars;

//стр. 217
public class EnglishSpeakingWorld2 {

    String mars;

    void visitIdaho() {
        System.out.println("Выполняется visitIdaho():");

        mars = " красная планета";
        String atomicCity = " население: 25 человек";

        System.out.println(mars);
        System.out.println(atomicCity);
    }

    void visitNewJersey() {
        System.out.println("Выполняется visitNewJersey():");
        System.out.println(mars);
    }
}

class GetGoing2 {

    public static void main(String[] args) {

        EnglishSpeakingWorld2 e = new EnglishSpeakingWorld2();
        e.visitIdaho();
        e.visitNewJersey();
    }
}