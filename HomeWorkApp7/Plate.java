package HomeWorkApp7;

public class Plate {
    int food;

    public Plate(int food) {
    this.food = food;
    }

    public void decreaseFood (int appetite) {
        if (this.food < appetite) {
            status();
        } else this.food -= appetite;
    }

    public void status () {
        System.out.println("Тарелка: " + food);
    }

    public void addFood (int food) {
        System.out.println();
        System.out.println("Хозяин всеяруси дал крошку хлеба");
        System.out.println();
        this.food += food;
    }
}
