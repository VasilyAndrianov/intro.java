package Them2;
//** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

public class task5 {
    public static void main(String[] args) {
        int [] n = {1, 4, 8, 34, 46, 2, 87, 65};
        int min = n[0];
        int max = n[0];
        for (int i = 0; i < n.length; i++){
            if (n[i] < min){
                min = n[i];
            }

        }
        for (int i = 0; i < n.length; i++){
            if (n[i] > max){
                max = n[i];
            }
        }
        System.out.println("Минимальное число " + min);
        System.out.println("Максимальное число " + max);
    }
}
