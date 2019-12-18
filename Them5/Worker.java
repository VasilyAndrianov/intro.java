package Them5;

public class Worker {
    private String name;              //ФИО сотрудника
    private String position;          //должность
    private String email;             //электронная почта
    private String  telephoneNmber;   //телефон
    private int salary;               //зарплата
    private int age;                  //возраст


    //конструктор класса Worker
    public Worker(String name, String position, String email, String telephoneNmber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephoneNmber = telephoneNmber;
        this.salary = salary;
        this.age = age;
    }
    //метод вывода
    void getFullInfo() {
        System.out.println("name: " + name + " | position: " + position + " | email: " + email + " | salary: " + salary + " | age: " + age);
    }

    int getAge() {
        return age;
    }
}
