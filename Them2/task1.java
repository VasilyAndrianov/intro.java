package Them2;

public class task1 {
    public static void main(String[] args) {
        /**Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         * */
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 1};
        int s = arr.length;

        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]);
        }

        System.out.println("");

        for (int i = 0; i < s; i++)
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]);
        }

    }
}



