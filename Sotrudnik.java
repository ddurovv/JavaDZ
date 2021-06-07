

public class Sotrudnik {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Sotrudnik(String name, String position, String email, String phone, int salary, int age) {
     this.name = name;
     this.position = position;
     this.email = email;
     this.phone = phone;
     this.salary = salary;
     this.age = age;
    }
    void printInfo(){
        System.out.print("Сотрудник: " + this.name + " Должность:" + this.position + " Почта:" + this.email + " Телефон:" + this.phone + " З/п: " + this.salary + " Возраст: " + this.age);
        System.out.println();
    }
}
