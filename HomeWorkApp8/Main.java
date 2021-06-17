package HomeWorkApp8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String quest;
    public static void main(String[] args) {
        //new MyWindow();

        //1.Срабтывает рандом
        System.out.println("Компьютер загадал слово");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
       Random random = new Random();
       String questRandom = words[random.nextInt(words.length)];
        //String questRandom = "sabaka";//для упрощения проверки
        //2.Выводится первая буква загаданного слова среди 15-ти астерисков
        //2.1.Создать массив 15-ти астерисков
        //2.2.Первый симфол заменяется на первый символ загаданного слова
        char[] answer = {questRandom.charAt(0),'*','*','*','*','*','*','*','*','*','*','*','*','*','*'};
        System.out.println(answer);
        //3.Ход человека
        while (true) {
            quest = questScan();
            //3.1.Если слово совпадает с загаданным - победа
            if (hasWinner(questRandom)) {
                System.out.println("Правильно, это слово " + questRandom);
                break;
            }
            //3.2.Если слово совпадает по первым символам - они заменяются в масииве астерисков
            else if (hasSameSymbol(questRandom) >= 1) {
                for (int i = 0; i <= hasSameSymbol(questRandom); i++) {
                    answer[i] = quest.charAt(i);
                }
                System.out.println("Слово похоже, но не полностью");
                System.out.println(answer);
            }
            //3.3.Если слово не совпадает с загаданным, выводится сообщение
            else {
                System.out.println("Попробуйте ещё раз");
                System.out.println(answer);
            }
        }
    }

    public static String questScan() {
        String x;
        Scanner scanner = new Scanner(System.in);
        //do {
            System.out.println("Угадайте слово?");
            x = scanner.nextLine();
        //} while (isCellValid(x));
        //} while (!scanner.hasNextLine()); - оно не работает. ни со значением true, ни с false
        return x;
    }

    public static int hasSameSymbol(String questR) {
        int counter = 0;
        for (int i = 1; i < quest.length(); i++) {
            if (quest.charAt(i) == questR.charAt(i)) {
                counter++;
            } else break;
        } return counter;
    }

    public static boolean hasWinner(String questRandom) {
        if (quest.equals(questRandom)) {
        return true;
        } return false;
    }

    //public static boolean isCellValid(String x) {
    //    boolean a;
    //    for (int i = 0; i < x.length(); i++) {
    //        a = ((x.charAt(i) >= 0) && (x.charAt(i) <= 9)) ? false : true;
    //    } return a;
    // } - тоже не работает
}
