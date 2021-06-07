import java.util.Random;
import java.util.Scanner;
public class HomeWorkApp4 {

    public static char[][] map;
    public static int Size;
    public static int Size_to_win;
    public static final char Dot_Empty = '.';
    public static final char Dot_X = 'X';
    public static final char Dot_0 = '0';
  /* public static int initialSize() {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Выберите размер игрового поля - введя длину стороны от 3 до 5");
            Size = scanner.nextInt();
        } while (!isLengthValid(Size));
    }*/
    public static boolean isLengthValid(int x){
        return ((x <= 5) && (x >= 3));
    }
    public static boolean isSize_to_winValid(int x)
    {
        return ((x <= Size) && (x >= 3));
    }
    public static void main(String[] args) {
        //инициация размера поля
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Выберите размер игрового поля - введя длину стороны от 3 до 5");
            Size = scanner.nextInt();
        } while (!isLengthValid(Size));
        Scanner scanner1 = new Scanner(System.in);
        if (Size != 3) {
            do {
                System.out.println("Выберите выберите количество фишек от 3 до " + Size);
                Size_to_win = scanner1.nextInt();
            } while (!isSize_to_winValid(Size_to_win));
        } Size_to_win = 3;
        //1. Инициация поля
        initMap();
        //2. Вывод поля
        printMap();
        //3. Цикл
        while (true) {
            //итерация
            humanTurn();
            printMap();
            if (isWinner(Dot_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (isWinner(Dot_0)) {
                System.out.println("Победил монстр");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
    map = new char[Size][Size];
    for (int i = 0; i < Size; i++) {
        for (int j = 0; j < Size; j++){
            map[i][j] = Dot_Empty;
        }
    }
    }
    public static void printMap() {
        for (int i = 0; i <= Size; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < Size; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < Size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    //3.1. Ход игрока
    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do{
            System.out.println("Введите координаты в формате Х Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = Dot_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= Size || y < 0 || y >= Size) {
            return false;
        }
        if (map[y][x] == Dot_Empty) {
            return true;
        }
        return false;
    }
    //3.4. Ход компьютера
    public static void aiTurn() {
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {

            }
        }
        Random random = new Random();
        int x;
        int y;
        do{
            x = random.nextInt(Size);
            y = random.nextInt(Size);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = Dot_0;
    }
    public static boolean isWinner(char symb) {
        int endBend = map.length - Size;

        for (int rowBend = 0; rowBend <= endBend; rowBend++){
            if (isDiagonal(symb, rowBend))
            {
                return true;
            }
            for (int columnBend = 0; columnBend <= endBend; columnBend++)
            {
                boolean hasWin =
                        isVertHorizontal(symb, rowBend, columnBend);
                if (hasWin)
                {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isVertHorizontal(char symb, int rowBend, int colmBend) {
        for (int row = rowBend; row < (Size_to_win + rowBend); row++)
        {
            int avert = 0;
            int bhoriz = 0;

            for (int column = colmBend; column < (Size_to_win + colmBend); column++)
            {
                if (map[row][column] == symb)
                {
                    bhoriz++;
                }
                else
                {
                    bhoriz = 0;
                }
                if (map[column][row] == symb)
                {
                    avert++;
                }
                else
                {
                    avert = 0;
                }
            }
            if ((bhoriz == Size_to_win) || (avert == Size_to_win)) {
                return true;
            }
        }
        return false;
    }
static boolean isDiagonal(char symb, int rowBend) {
        int diagonal = 0;
        int invDiagonal = 0;

        final int subSquareLength = (Size_to_win + rowBend);

        for (int row = rowBend; row < subSquareLength; row++) {
            if (map[row][row] == symb) {
                diagonal++;
            }
            else
            {
                diagonal = 0;
            }
            if (map[row][map.length - 1 - row] == symb) {
                invDiagonal++;
            }
            else
            {
                invDiagonal = 0;
            }
        }
        return (diagonal == Size_to_win) || (invDiagonal == Size_to_win);
}



       /* if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) {
            return true;
        }
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) {
            return true;
        }
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) {
            return true;
        }

        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) {
            return true;
        }
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) {
            return true;
        }

        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) {
            return true;
        }
//needs Cicle!
        return false; */

    public static boolean isMapFull() {
        for (int i = 0; i < Size; i++){
            for (int j = 0; j < Size; j++) {
              if (map[i][j] == Dot_Empty) {
                  return false;
              }
            }
        }
        return true;
    }

}