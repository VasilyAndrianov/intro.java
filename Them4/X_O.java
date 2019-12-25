package Them4;

import java.util.Random;
import java.util.Scanner;

public class X_O {
    public static void main(String[] args) {
        intField();
        printField();
        do {
            player();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("Вы выйграли!");
                break;
            }else if (checkAllMap()) {
                break;
            }
            AI();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("Выйграл компьютер");
                break;
            }else if (checkAllMap()) {
                break;
            }
        }while (true);
    }

    //инициализация игрового поля, знаков игроков и объявление методов
    static Random rnd = new Random();
    public static Scanner sc = new Scanner(System.in);
    static int SIZE_X = 5;                  //размерность поля по горизонтали
    static int SIZE_Y = 5;                  //размерность поля по вертикали
    static char [][] map = new char[SIZE_X][SIZE_Y];
    static final char EMPTY_DOT = '.';           //символ пустого поля
    static final char PLAYER_DOT = 'X';          //символ игрока
    static final char AI_DOT = 'O';              //символ компьютера
    static int win = 4;                          //кол-во заполненых клеток, для победы

    //инициализация поля
    static void intField(){
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }
    //печать поля
    private static void printField() {
        for (int i = 0; i < SIZE_X; i++) {
            if (i == 0) {
                System.out.print("   " + (i + 1) + " ");
            } else {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE_X; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < SIZE_Y; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }

    }
    //проверка на свободную клетку
    private static boolean valid(int y, int x){
        if (x < 0 || y < 0 || x >= SIZE_X || y >= SIZE_Y){
            return false;
        }else if (!(map[x][y] == EMPTY_DOT)) return false;

        return true;
    }
    //ход игрока
    private static void player(){
        int x;
        int y;
        do {
            System.out.println("Введите(через пробел) координаты X и Y:");
            x = sc.nextInt() -1;
            y = sc.nextInt() -1;
        }
        while (!valid(x,y));
        setSymbol(x, y, PLAYER_DOT);
    }
    private static void setSymbol(int y, int x, char symbol) {
        map[x][y] = symbol;
    }


    //ход компа
    private static void AI() {
        int x, y;
        //блок хода игрока
        if (move(PLAYER_DOT)) return;
        //игра на победу
        if (move(AI_DOT)) return;

        //случайный ход
        do {
            y = rnd.nextInt(SIZE_Y);
            x = rnd.nextInt(SIZE_X);
        } while (!checkMove(y, x));
        setSymbol(y, x, AI_DOT);
    }

    private static boolean move(char playerDot) {
        for (int v = 0; v < SIZE_X; v++) {
            for (int h = 0; h < SIZE_Y; h++) {
                //проверка поля
                if (v + win <= SIZE_X) {                           //по вертикале
                    if (checkVer(v, h, playerDot) == win - 1) {
                        if (MoveAIVer(v, h, AI_DOT)) return true;
                    }
                }
                if (h + win <= SIZE_Y) {                           //по горизонтали
                    if (checkHor(v, h, playerDot) == win - 1) {
                        if (MoveAIHor(v, h, AI_DOT)) return true;
                    }

                    if (v - win > -2) {                            //вверх по диагонали
                        if (checkDiUp(v, h, playerDot) == win - 1) {
                            if (MoveAIDiagUp(v, h, AI_DOT)) return true;
                        }
                    }
                    if (v + win <= SIZE_X) {                       //вниз по диагонали
                        if (checkDiDown(v, h, playerDot) == win - 1) {
                            if (MoveAIDiagDown(v, h, AI_DOT)) return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * Ниже описаны хода компьютера
     * вертикаль
     * горизонталь
     * диагональ вверх
     * диагональ вниз
     */
    private static boolean MoveAIVer(int v, int h, char symbol) {
        for (int i = v; i < win; i++) {
            if ((map[i][h] == EMPTY_DOT)) {
                map[i][h] = symbol;
                return true;
            }
        }
        return false;
    }

    private static boolean MoveAIHor(int v, int h, char symbol) {
        for (int j = h; j < win; j++) {
            if ((map[v][j] == EMPTY_DOT)) {
                map[v][j] = symbol;
                return true;
            }
        }
        return false;
    }

    private static boolean MoveAIDiagUp(int v, int h, char symbol) {
        for (int i = 0, j = 0; j < win; i--, j++) {
            if ((map[v + i][h + j] == EMPTY_DOT)) {
                map[v + i][h + j] = symbol;
                return true;
            }
        }
        return false;
    }

    private static boolean MoveAIDiagDown(int v, int h, char symbol) {

        for (int i = 0; i < win; i++) {
            if ((map[i + v][i + h] == EMPTY_DOT)) {
                map[i + v][i + h] = symbol;
                return true;
            }
        }
        return false;
    }

    //проверка поля для хода игрока
    private static boolean checkMove(int y, int x) {
        if (x < 0 || x >= SIZE_X || y < 0 || y >= SIZE_Y) return false;
        else if (!(map[x][y] == EMPTY_DOT)) return false;

        return true;
    }


    //проверка победы
    private static boolean checkWin(char symbol) {
        for (int v = 0; v < SIZE_X; v++) {
            for (int h = 0; h < SIZE_Y; h++) {
                if (v + win <= SIZE_X) {                           //по вертикали
                    if (checkVer(v, h, symbol) >= win) return true;
                }
                if (h + win <= SIZE_Y) {                           //по горизонтали
                    if (checkHor(v, h, symbol) >= win) return true;

                    if (v - win > -2) {                            //диагональ вверх
                        if (checkDiUp(v, h, symbol) >= win) return true;
                    }
                    if (v + win <= SIZE_X) {                       //диагональ вниз
                        if (checkDiDown(v, h, symbol) >= win) return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Ниже описана проверка заполнености поля
     * вертикаль
     * горизонталь
     * диагональ вверх
     * диагональ вниз
     * ничья
     */
    private static int checkVer(int v, int h, char symbol) {
        int с = 0;
        for (int i = v; i < win + v; i++) {
            if ((map[i][h] == symbol)) с++;
        }
        return с;
    }
    private static int checkDiUp(int v, int h, char symbol) {
        int с = 0;
        for (int i = 0, j = 0; j < win; i--, j++) {
            if ((map[v + i][h + j] == symbol)) с++;
        }
        return с;
    }
    private static int checkDiDown(int v, int h, char symbol) {
        int с = 0;
        for (int i = 0; i < win; i++) {
            if ((map[i + v][i + h] == symbol)) с++;
        }
        return с;
    }
    private static int checkHor(int v, int h, char symbol) {
        int с = 0;
        for (int j = h; j < win + h; j++) {
            if ((map[v][j] == symbol)) с++;
        }
        return с;
    }
    private static boolean checkAllMap(){
        for (int i = 0; i < SIZE_X ; i++) {
            for (int j = 0; j < SIZE_Y ; j++) {
                if (map[i][j] == EMPTY_DOT) return false;

            }
        }
        System.out.println("Ничья!");
        return true;
    }
}
