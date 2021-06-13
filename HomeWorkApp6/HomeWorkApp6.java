package HomeWorkApp6;

import java.util.Scanner;

public class HomeWorkApp6 {
    public static int quest1;
    public static String nameQuest;
    public static String colorQuest;
    public static int ageQuest;
    public static int runDistanceQuest;
    public static int swimDistanceQuest;
    public static void main(String[] args) {
        Cat firstCat = new Cat("Обормот", "серый", 15, 100);
        Cat secondCat = new Cat("Коровий рот", "рыжий", 5, 200);
        Dog firstDog = new Dog("Забияка", "белый", 5, 500, 5);
        Dog secondDog = new Dog("Чёрная бяка", "чёрный", 8, 200, 10);

        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Какое животное Вы хотите завести?");
            System.out.println("Кота или собаку? (ответить 1 или 2)");
            quest1 = scanner1.nextInt();
        } while (!isLengthValid(quest1));

        Scanner scanner2 = new Scanner(System.in);
            System.out.println("Как вы его назовёте?");
            nameQuest = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
            System.out.println("Какой у него цвет?");
            colorQuest = scanner3.nextLine();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("А сколько ему лет?");
        if (scanner4.hasNextInt()) {
            ageQuest = scanner4.nextInt();
        } else System.out.println("Мне надоели твои выходки, нажми рестарт");

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("На какую дистанцию побежит " + nameQuest + "?");
         if (scanner5.hasNextInt()) {
             runDistanceQuest = scanner5.nextInt();
         } else System.out.println("на такую дистанцию никто не побежит!");

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("На какую дистанцию поплывёт " + nameQuest + "?");
        if (scanner6.hasNextInt()) {
            swimDistanceQuest = scanner6.nextInt();
        } else {System.out.println("цикла проверки не будет, начинай заново");
                System.out.println();}


        if (quest1 == 1) {
            Cat choice = new Cat(nameQuest, colorQuest, ageQuest, runDistanceQuest);
                if (choice.runDistance <= Cat.maxRunDist) { //забег котов
                    choice.run();
                    firstCat.run();
                    secondCat.run();
                } else {System.out.println("кот " + choice.name + " может пробежать только " + Cat.maxRunDist);
                firstCat.run();
                secondCat.run();
            System.out.println();}
            choice.swim(); //заплыв котов
        } else {
            Dog choice = new Dog(nameQuest, colorQuest, ageQuest, runDistanceQuest, swimDistanceQuest);
                if (choice.runDistance <= Dog.maxRunDist) { //забег у собак
                System.out.println();
                choice.run();
                firstDog.run();
                secondDog.run();
                } else System.out.println("собака:" + choice.name + " может пробежать только " + Dog.maxRunDist);

                if (choice.swimDistance <= Dog.maxSwimDist) {//заплыв у собак
                System.out.println();
                choice.swim();
                firstDog.swim();
                secondDog.swim();
                } else System.out.println("собака:" + choice.name + " может проплыть только " + Dog.maxSwimDist);
        }


    }
    public static boolean isLengthValid(int x) {
        return ((x == 1) || (x == 2));
    }
}
