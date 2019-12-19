package Them5;

public class workerMain {
    public static void main(String[] args) {
        Worker[] empl = new Worker[5];
        empl[0] = new Worker("Corey Taylor", "artist", " slipknot@mailbox.com ", "892312312", 437000, 45);
        empl[1] = new Worker(" Nikki Sixx", "artist", "sixx@gmail.com", "89342234243", 450000, 60);
        empl[2] = new Worker("Mick Mars", "guitarist", "mmars@mailbox.ru", "89432234433", 455000, 68);
        empl[3] = new Worker("Deryck Whibley", "artist", "sum41@yandex.ru", "82532353491", 285000, 39);
        empl[4] = new Worker("Avril Lavigne", "artist", "avr@gmail.com", "89234549824 ", 385000, 35);
        for (int i = 0; i < empl.length; i++) {
            if(empl[i].getAge() > 40){
                empl[i].getFullInfo();
            }
        }
    }
}
