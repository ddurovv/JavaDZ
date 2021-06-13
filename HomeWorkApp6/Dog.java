package HomeWorkApp6;

public class Dog extends Animal{
    static int maxRunDist = 500;
    static int maxSwimDist = 10;
    int runDistance;
    int swimDistance;
    Dog(String name, String color, int age, int runDistance, int swimDistance) {
        super(name, color, age);
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    void run() { if (this.age == 1) {
        System.out.println("однолетняя " + this.color + " собака-" + this.name + " пробежала - " + this.runDistance + "м");
    } else if (this.age == 2) {
        System.out.println("двухлетняя " + this.color + " собака-" + this.name + " пробежала - " + this.runDistance + "м");
    } else if (this.age == 3) {
        System.out.println("трёхлетняя " + this.color + " собака-" + this.name + " пробежала - " + this.runDistance + "м");
    } else if (this.age == 4) {
        System.out.println("четырёхлетняя " + this.color + " собака-" + this.name + " пробежала - " + this.runDistance + "м");
    } System.out.println(this.age + "-тилетняя " + this.color + " собака-" + this.name + " пробежала - " + this.runDistance + "м");
    }

    void swim() {
     System.out.println(this.color + " собака-" + this.name + " проплыла - " + this.swimDistance + "м");
    }
}
