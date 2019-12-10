package Them2;

public class task3 {
    public static void main(String[] args) {
        /**адать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMass = num.length;

        for (int i = 0; i < maxMass; i++) {
            if (num[i] < 6) num[i] = num[i] * 2;
        }
        for (int i = 0; i < maxMass; i++) {
            System.out.print(num[i] + ",");
        }
    }
}
