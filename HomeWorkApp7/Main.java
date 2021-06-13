package HomeWorkApp7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Дуся", 20),
                new Cat("Пуся", 25),
                new Cat("Бабуся", 15),
        };
        Plate plate = new Plate(59);

    for (Cat cat : cats) {
        cat.eat(plate);
    }
    //один кот-привереда не стал есть
        plate.addFood(1); //хозяин добавил 1ед. корма

    for (Cat cat : cats) {
        cat.eat(plate);
    }//все голодные коты поели
    plate.status();
    }
}
