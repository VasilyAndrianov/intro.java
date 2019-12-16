package Them3;

import java.util.Random;
import java.util.Scanner;

public class lesson3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        word();
    }

    private static void word() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        StringBuffer bf = new StringBuffer();
        int rnd = rand.nextInt(24);
        boolean victory = false;
        String playerWord;

        System.out.println("Угадайте слово, которое загадал компьютер");
        String w = words[rnd];

        do {
            System.out.println("Введите слово");
            playerWord = sc.next();

            if (w.equals(playerWord.toLowerCase())){
                victory = true;
            }
            if (!victory){
                System.out.println("Это не верное слово, повторите попытку");

                for (int i = 0; i < w.length() ; i++) {
                    if (playerWord.length() >i && playerWord.charAt(i) == w.charAt(i)){
                        bf.append(playerWord.charAt(i));
                    }else bf.append("###");

                }
                System.out.println("Вот буквы, которые вы угадали " + bf.toString());
                System.out.println();
            }
        }while (!w.equals(playerWord.toLowerCase()));
        {
            System.out.println("Вы угадали!");
        }



    }
}
