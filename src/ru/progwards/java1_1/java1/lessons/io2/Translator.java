package ru.progwards.java1_1.java1.lessons.io2;

/*

Задача 2. Класс Translator
Создать класс Translator - переводчик, который будет переводить предложения с одного языка на другой

2.1 Конструктор Translator(String[] inLang, String[] outLang), где inLang и outLang -
 массивы слов на разных языках, например русском и английском. Сохранить значения параметров в приватных свойствах класса

2.2  Метод public String translate(String sentence), в котором найти слова,
содержащиеся в sentence и в inLang и заменить их на соответствующие в outLang.
 Пунктуация должна быть соблюдена (скопирована из оригинальной строки).
  При этом надо соблюсти заглавные буквы, если они были в оригинальном тексте.
  В inLang и outLang все слова хранятся в нижнем регистре.

Например, фраза
"Hello World!" будет переведена как "Привет Мир!"
при наличии слов "hello", "world" в inLang и "привет", "мир" в outLang*/
public class Translator {

    String[] inLang;
    String[] outLang;

    public Translator(String[] inLang, String[] outLang) {
        this.inLang = inLang;
        this.outLang = outLang;
    }

    public String translate(String sentence) {

        String nevSentence = "";
        String[] sentenceArr = sentence.split(" ");//преобразовали строку в массив разделитель пробел

        for (int i = 0; i < sentenceArr.length; i++) {//берем слово из массива
            String str = "";//оригинал слово в нижнем регистре без символов
            String strSimvol = ""; //оригинал слово в нижнем регистре с символами
            String strP = "";//переведенное слово в нижнем регистре
            boolean[] upper = new boolean[sentenceArr[i].length()];//массив в котором указано какая буква в каком регистре
            int charI = 0;//счетчик
            for (char c : sentenceArr[i].toCharArray()) {//переводим слово в массив из букв

                if (Character.isLetter(c)) {
                    str = str + Character.toLowerCase(c);//собираем слово из букв нижнего регистра
                    upper[charI] = Character.isUpperCase(c);
                    charI++;
                }
                strSimvol = strSimvol + Character.toLowerCase(c);//это символ
            }
            // for (boolean values : upper) {           System.out.print("," + values);       }
            // System.out.println("str"+i +"- "+str);
            String strEnd = "";

            for (int g = 0; g < inLang.length; g++) {//ищем наше слово в массиве inLang и узнаем индекс
                if (str.equals(inLang[g])) {//если найдено то
                    strP = outLang[g];//узнав индекс берем слово по индексу из outLang и заменяем существующее

                    int charI2 = 0;//счетчик
                    for (char c : strP.toCharArray()) {//переводим переведенное слово в массив из букв
                        if (upper.length > charI2) {// если массив меньше нового слова
                            if (upper[charI2] == true & upper.length >= charI2) {//если даная буква по индексу
                                // оригинального слова была в верхнем регистре
                                strEnd = strEnd + Character.toUpperCase(c); //переводим в верхний регистр
                            } else {
                                strEnd = strEnd + Character.toLowerCase(c);//переводим в нижний регистр
                            }
                        } else {
                            strEnd = strEnd + Character.toLowerCase(c);//переводим оставшиеся буквы в нижний регистр
                        }
                        charI2++;
                    }

                    break;
                }
            }


//            System.out.println("str переведенное - "+str);
//            System.out.println("strP переведенное - "+strP);
//            System.out.println("strEnd в регистре - "+strEnd);
//            System.out.println("simvol"+i +"- "+strSimvol);
//
//            System.out.println(strSimvol.replace(str,strEnd));
            //strSimvol.replace(str,strEnd); //находим в слове оригинала с символами но в нижнем регистре и
            // делаем замену на перевод оставляя символы на прежнем месте
            nevSentence = String.join(" ", nevSentence, strSimvol.replace(str, strEnd)); //собираем строку
        }

        nevSentence = nevSentence.trim();//удаляем лишний пробел в начале строки
        return nevSentence;
    }

    public static void main(String[] args) {
        String[] inLang = {"hello", "world"};
        String[] outLang = {"привет", "мир"};
        String sentence = "Hello World!";
        Translator translator = new Translator(inLang, outLang);

//        System.out.println(translate(sentence));
//        translate(sentence)
        translator.translate(sentence);
        System.out.println(translator.translate(sentence));
    }
}

