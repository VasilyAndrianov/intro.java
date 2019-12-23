package Them6;
//Наследник класса животные, собаки
public class Dog extends Animals {
    String name;
    double jump = 0.5;  //максимальная высота прыжка
    int sweem = 10;     //максимальное расстояние вплавь
    int run = 500;      //максимальное рассотяние бегом

    public Dog(String name, int sweem, int run, double jump){
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }
    void dogInfo() {
        System.out.println("dogName: " + name + " | runMax: " + run+ " | sweemMax:" + sweem + " | jumpMax: " +jump);
    }

    @Override
    public void vois() {
        System.out.println("Собака гавкнула");
    }

    //метод - бег
    public static void dogRun(int i){
        int dogMax = 500;
        if (i <= dogMax){
            System.out.println(true);
        }else if (i > dogMax) {
            System.out.println(false);
        }
    }
    //метод - прыжок
    public static void dogJump(double i){
        double dogMax = 0.5;
        if (i <= dogMax){
            System.out.println(true);
        }else if (i > dogMax) {
            System.out.println(false);
        }
    }
    //метод - плаванье
    public static void dogSweem(int i){
        int dogMax = 10;
        if (i <= dogMax){
            System.out.println(true);
        }else if (i > dogMax) {
            System.out.println(false);
        }
    }

    @Override
    public void voise() {

    }
}
