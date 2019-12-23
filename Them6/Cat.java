package Them6;
//Наследник класса животные, кошки
public class Cat extends Animals {



    String name;
    double jump = 2;                //максимальная высота прыжка
    boolean sweem = false;          //максимальное расстояние вплавь
    int run = 200;                  //максимальное рассотяние бегом
    private int appetite;           //объём еды, для состояния "сытого кота"
    private boolean full;           //состояние сытости(изначально кот голоден)


    public Cat(String name, boolean sweem, int run, double jump){
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    //реализация методов из задания ООП
    //информация о коте(общие характеристики)
    void catInfo() {
        System.out.println("catName: " + name + " | runMax: " + run+ " | sweemMax:" + sweem + " | jumpMax: " +jump + "| appetite: " + appetite);
    }
    //метод - бег
    public static void run(int i) {
        int catMax = 200;
        if (i <= catMax){
            System.out.println(true);
        }else if (i > catMax) {
            System.out.println(false);
        }
    }
    //метод - плаванье
    public static void sweem() {
        System.out.println(false);
    }
    //метод - прыжок
    public static void catJump(int i){
        int catMax = 2;
        if (i <= catMax){
           System.out.println(true);
        }else if (i > catMax) {
            System.out.println(false);
        }
    }

    @Override
    public void voise() {
        System.out.println("Кот мяукнул");
    }
}
