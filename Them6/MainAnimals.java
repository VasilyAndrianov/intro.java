package Them6;

public class MainAnimals {
    public static void main(String[] args) {
        Cat a = new Cat("Murzik", false, 200, 2);
        Dog d = new Dog("Kron", 10, 500, 0.5);

        d.dogInfo();
        a.catInfo();

        Cat.run(320);
        Cat.catJump(2);
        Dog.dogRun(400);
        Dog.dogSweem(50);


    }
}


