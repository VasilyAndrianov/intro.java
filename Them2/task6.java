package Them2;
//** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят
public class task6 {
    public static void main(String[] args) {
        int[] number ={1,13,7,15,4};
        int [] num ={4,2,6,3,3,6};
        System.out.println(sumBalance(number));
        System.out.println(sumBalance(num));
    }
    static boolean sumBalance(int[] arr){
        int leftSum;
        int rightSum;
        for (int i = 0; i < arr.length - 1; i++){
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j <= i; j++)
                leftSum += arr[j];
            for (int x = i +1; x < arr.length; x++)
                rightSum += arr[x];
            if (leftSum == rightSum){
                return true;
            }
        }
        return false;
    }
}
