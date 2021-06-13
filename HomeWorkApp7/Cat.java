package HomeWorkApp7;

public class Cat {
    private boolean satiety;
    private String name;
    private int appetite;

    public Cat(String name, int appetite ) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.food < this.appetite && !satiety) {
            System.out.println("в тарелке недостаточно корма !!!");
            whatSatiety();
    } else if (!satiety) { plate.decreaseFood(appetite);
            satiety = true;
            whatSatiety();
        } else whatSatiety();
    }


    private void whatSatiety() {
        if (satiety) {
        System.out.println(this.name + " - наелся и спит"); }
        else System.out.println(this.name + " - недоволен социалистической несправедливостью, голод его доконал");
    }
}
