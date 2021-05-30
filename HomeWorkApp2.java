public class HomeWorkApp2 {
    public static void main(String[] args) {
        // Задание 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
        // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        boolean x1;
        System.out.println(method1(1, 11));
        method2(3);
        System.out.println(method3(5));
        method4("sabaka", 5);
        System.out.println(isSpecial(2012));



    }
        public static boolean method1(int a, int b) {
        if ( a+b >=10 && a+b <=20) {
            return true;
        } else {
            return false;
        }
        }

        //Задание 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

        public static void method2(int x) {
            if (x >= 0) {
                System.out.println("Число положительное");
            } else System.out.println("Число отрицательное");
        }

        //Задание 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        // если число отрицательное, и вернуть false если положительное.

        public static boolean method3(int i) {
         boolean c = false;
            if (i >= 0) { return (c);
            } else return (!c); }

        //Задание 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
        // отпечатать в консоль указанную строку, указанное количество раз;
        public static void method4(String n1, int n2) {
        int i = 1;
             while (i <= n2) {
                    System.out.println(n1); i++;
                }
            }
        // * Написать метод, который определяет, является ли год високосным, и возвращает boolean
        // (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
        // при этом каждый 400-й – високосный.

        private static boolean isSpecial(int year) {
        return year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0));
    }
}
