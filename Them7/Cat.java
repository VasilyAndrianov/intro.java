package Them7;

public class Cat extends Animals {
    protected String name;
    protected int appetite;         // аппетит
    protected boolean satiety;      // сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;       // при создании кот голодный
    }

    public void setSatiety(boolean satiety) {   // установка сытости в нужное "положение"
        this.satiety = satiety;
    }

    public boolean eatFood(int quantityOfFood) {
        if (satiety = true) {
            if (appetite <= quantityOfFood) {
                setSatiety(true);
                System.out.println(name + " наелся");
                return true;
            } else {
                System.out.println(name + " не притронулся. Мало еды");
                return false;
            }
        } else {
            System.out.println(name + " сытый");
            return false;
        }
    }

    public void eatFoodFromPlate(Plate plate) {
        if (eatFood(plate.getQuantityOfFood())) {
            plate.empty(appetite);
        }
    }

    @Override
    public void voise() {
            System.out.println("Кот мяукнул");
    }
}
//миска
class Plate {
    private int maxQuantityOfFood;
    private int quantityOfFood;

    public Plate(int maxQuantityOfFood) {
        this.maxQuantityOfFood = maxQuantityOfFood;
        this.quantityOfFood = 0;
    }

    public int getQuantityOfFood() {        // сколько еды в миски?
        return quantityOfFood;
    }

    public int getMaxQuantityOfFood() {     // вместимость миски?
        return maxQuantityOfFood;
    }

    public void fill(int quantityOfFood) {                                                              // наполнение миски
        if ((quantityOfFood <= (maxQuantityOfFood - this.quantityOfFood)) && quantityOfFood > 0) {      // проверка, влезет ли еда
            this.quantityOfFood = this.quantityOfFood + quantityOfFood;
        }
    }

    public void empty(int quantityOfFood) {                                                            // опустошение миски
        if (this.quantityOfFood >= quantityOfFood) {                                                   // проверка, в миске достаточно еды или нет
            this.quantityOfFood = this.quantityOfFood - quantityOfFood;
        }
    }
}


