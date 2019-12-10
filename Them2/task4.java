package Them2;

public class task4 {
    /**Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void main(String[] args) {
        int [][] arr = new int[7][7];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                    arr[arr.length - i - 1][j] = 1;
                }
            }
        }
        for (int[]row:arr){
            for (int value: row){
                System.out.print(" " + value + " ");
            }
            System.out.println();
        }


    }
}
