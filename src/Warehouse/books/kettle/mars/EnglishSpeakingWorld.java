package Warehouse.books.kettle.mars;

//стр. 215
public class EnglishSpeakingWorld {

    String mars = " красная планета";

    void visitPennsylvania() {
        System.out.println("Выполняется visitPennsylvania():");
        String mars = " родной город Мишки";

        System.out.println(mars);
        System.out.println(this.mars);
    }
}

class GetGoing {

    public static void main(String[] args) {

        System.out.println("Выполняется main():");
        EnglishSpeakingWorld e = new EnglishSpeakingWorld();
        System.out.println(e.mars);
        e.visitPennsylvania();
    }
}