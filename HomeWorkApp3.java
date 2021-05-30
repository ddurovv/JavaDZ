public class HomeWorkApp3 {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] a = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else a[i] = 1;
            //a[i] = (a[i] == 1) ? 0 : 1;
        }
        System.out.println();
        System.out.println("Task 1");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] b = new int[100];
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1);
        }
        System.out.println();
        System.out.println("Task 2");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < c.length; i++) {
            while (c[i] < 6) {
                c[i] = (c[i] * 2);
                break;
            }
        }
        System.out.println();
        System.out.println("Task 3");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
        // одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] aa = new int[8][8];
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                if ((i == j) || (i == (aa.length - j - 1))) {
                    aa[i][j] = 1;
                } else aa[i][j] = 0;
            }
        }
        System.out.println();
        System.out.println("Task 4");
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                System.out.print(aa[i][j] + " ");
            }
            System.out.println();
        }
        //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
        // типа int длиной len, каждая ячейка которого равна initialValue;
        System.out.println();
        System.out.println("Task 5");
        int[] myMassiv = oneArg(5,5);
        for (int i = 0; i < myMassiv.length; i++) {
            System.out.print(myMassiv[i]+" ");
        } //конец 5-ого задания, метод находится ниже
        System.out.println();
        System.out.println("Task 6");
        int[] mass = {1,6,3,0,6,2,2};
        maxMinMas(mass);// конец 6-ого задания
        System.out.println();
        System.out.println("Task 7");
        System.out.println(balance(mass));// конец 7-ого задания
        System.out.println();
        System.out.println("Task 8");
        int[] eight = {1,2,3,4,5};
        sdvig(eight, -2);// конец 8-ого задания ....................................................
    }
    public static int[] oneArg(int len, int initialValue ) {
        int[] massiv = new int[len];
        for (int i = 0; i < len; i++) {
            massiv[i] = initialValue;
        } return massiv;
    }
        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void maxMinMas(int[] inputMas) {
        int max = inputMas[0];
        int min = inputMas[0];
        for (int i = 1; i < inputMas.length; i++){
            if (min < inputMas[i]) { min = inputMas[i];}
            if (max > inputMas[i]) { max = inputMas[i];}
        }
        System.out.println("Максимум = "+ max);
        System.out.println("Минимум = "+ min);
    }
        //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны.
        //Примеры: checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        // checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
        //
        //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
    public static boolean balance(int[] inputMass) {
        int leftSum = 0;
        for (int i = 0; i < inputMass.length; i++) {
            leftSum += inputMass[i];
            int rightSum = 0;
            for (int j = (i+1); j < inputMass.length; j++) {
                rightSum += inputMass[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        } return false;
    }
        //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо)
        // -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
        // выбирать сами.
public static void sdvig(int[] inputM, int value) {
        int tmp = 0;
        int a = 0;
        do {
            if (value > 0) {
                tmp = inputM[0];
                inputM[0] = inputM[inputM.length - 1];
                for (int i = (inputM.length - 1); i > 0; i--) {
                    inputM[i] = inputM[i - 1];
                }
                inputM[1] = tmp;
            } else {
                tmp = inputM[inputM.length - 1];
                inputM[inputM.length - 1] = inputM[0];
                for (int j = 1; j < inputM.length; j++) {
                    inputM[j - 1] = inputM[j];
                }
                inputM[inputM.length - 2] = tmp;

            } a++;
        } while (a < Math.abs(value)); //хорошо, что есть модуль числа.
        for (int y = 0; y < inputM.length; y++){
            System.out.print(inputM[y]+" ");
        }
    }
}
