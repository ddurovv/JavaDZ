package HomeWorkApp6;

public class Cat extends Animal{
    static int maxRunDist = 200;
    int runDistance;
    Cat(String name, String color,int age, int runDistance) {
        super(name, color, age);
        this.runDistance = runDistance;
    }
    void run() { if (this.age == 1) {
        System.out.println("однолетний " + this.color + " кот-" + this.name + " пробежал - " + this.runDistance + "м");
    } else if (this.age == 2) {
        System.out.println("двухлетний " + this.color + " кот-" + this.name + " пробежал - " + this.runDistance + "м");
    } else if (this.age == 3) {
        System.out.println("трёхлетний " + this.color + " кот-" + this.name + " пробежал - " + this.runDistance + "м");
    } else if (this.age == 4) {
        System.out.println("четырёхлетний " + this.color + " кот-" + this.name + " пробежал - " + this.runDistance + "м");
    } System.out.println(this.age + "-тилетний " + this.color + " кот-" + this.name + " пробежал - " + this.runDistance + "м");
    }
    void swim() {
        System.out.println();
        System.out.println("Эти коты не плавают! Они электрические... поэтому заплыва не состоится(");
    }
}
