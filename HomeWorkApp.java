public class HomeWorkApp {
    public static void main (String[] args){
printThreeWords();
checkSumSign();
printColor();
compareNumbers();
    }
public static void printThreeWords() {
    System.out.println("Orange");
        System.out.println("Banana");
       System.out.println("Apple");
}
public static void checkSumSign() {
        int a;
        int b;
        a = 7;
        b = -2;
        int c;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
}
    public static void printColor() {
        int value = 123;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 8;
        int b = 3;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
