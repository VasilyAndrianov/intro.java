package Them7;
import java.util.Scanner;

public class MainAnimals {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Plate plate1 = new Plate (50);
        Plate bigPlate = new Plate(100);
        Cat[] cats = {
                new Cat("Luck", 15),
                new Cat("Boss", 30),
                new Cat("Murzik", 25),
                new Cat("Leo", 10),
                new Cat("Vist", 30)};

        do {
            System.out.print("В 1-й миске " + plate1.getQuantityOfFood() + " единиц еды, влезает " + plate1.getMaxQuantityOfFood() + " единиц. Сколько еды положить в миску? ");
            plate1.fill(scanner.nextInt());
        } while (plate1.getQuantityOfFood() == 0);

        //коты едят
        cats[1].eatFoodFromPlate(plate1);
        cats[2].eatFoodFromPlate(plate1);

        System.out.println("В 1-й миске осталось " + plate1.getQuantityOfFood() + " единиц еды");
        System.out.println();

        do {
            System.out.print("Во 2-й миске " + bigPlate.getQuantityOfFood() + " единиц еды, влезает " + bigPlate.getMaxQuantityOfFood() + " единиц. Сколько еды положить в миску? ");
            bigPlate.fill(scanner.nextInt());
        } while (bigPlate.getQuantityOfFood() == 0);

        for (Cat ct : cats) {
            while (bigPlate.getQuantityOfFood() < ct.appetite) {
                System.out.print("Для того, чтобы " + ct.name + " поел, не хватает еды (" + (bigPlate.getQuantityOfFood() - ct.appetite) + " ед.) Наполните миску ");
                bigPlate.fill(scanner.nextInt());
                System.out.println("Во 2-й миске " + bigPlate.getQuantityOfFood() + " единиц еды");
            }
            ct.eatFoodFromPlate(bigPlate);
        }

        for (Cat ct : cats) {
            System.out.println(ct.name + " (сытость: " + ct.satiety + " )");
        }

    }
}


