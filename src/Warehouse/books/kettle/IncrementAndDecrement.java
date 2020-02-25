package Warehouse.books.kettle;


public class IncrementAndDecrement {

    public static void main(String[] args) {

        //Префиксный инкремент
        System.out.println("Префиксный инкремент");
        int nPre = 55;
        ++nPre;
        System.out.println(nPre);
        System.out.println(++nPre);
        System.out.println(nPre);

        //Постфиксный инкремент
        System.out.println("Постфиксный инкремент");
        int nPos = 55;
        nPos++;
        System.out.println(nPos);
        System.out.println(nPos++);
        System.out.println(nPos);

        //Префиксный декремент
        System.out.println("Префиксный декремент");
        int nPreD = 55;
        --nPreD;
        System.out.println(nPreD);
        System.out.println(--nPreD);
        System.out.println(nPreD);

        //Постфиксный декремент
        System.out.println("Постфиксный декремент");
        int nPosD = 55;
        nPosD--;
        System.out.println(nPosD);
        System.out.println(nPosD--);
        System.out.println(nPosD);
    }
}
