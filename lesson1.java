package Them1.lesson1;

public class lesson1 {

        //Задание, метод main
        public static void main(String[] args){}

        // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат(аргументы этого метода, имеющие тип float)
        private static float sum(float a, float b, float c, float d){
            return a*(b + (c / d));
        }

        // Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        private static boolean check (int a, int b){
            int sum = a + b;
            if (10 <= sum && sum <= 20 ){
                return true;
            }else {
                return false;
            }
        }

        // Написать метод, которому в качестве параметра передается целое число, метод должен
        // напечатать в консоль, положительное ли число передали или отрицательное. ​
        // Замечание: ноль считаем положительным числом.
        private static void positiveOnNegative(int x){
            if (x < 0){
                System.out.println("Ваше число отрицательное");
            }else {
                System.out.println("Ваше число положительное");
            }
        }

        //Написать метод, которому в качестве параметра передается целое число.
        //Метод должен вернуть true, если число отрицательное.
        private static boolean isNegative(int x){
            return (x < 0);
        }

        /**Написать метод, которому в качестве параметра передается строка, обозначающая имя.
         * Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
         * */
        private static void printHello(String name){
            System.out.println("Привет, " + name);
        }

        // *Написать метод, который определяет, является ли год високосным, и выводит сообщение в
        // консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        private static boolean isYear(int year){
            return ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0));

        }

}
