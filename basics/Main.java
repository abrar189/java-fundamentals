import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        int number=1;
        System.out.println("I own " + number + " " + pluralize("cat", number) + ".");
        flipNHeads(3);

clock();    }

    public static String pluralize(String ele, int number){

        if(number <= 0){
            return ele+"s";
        }
        if(number == 1){
            return  ele;
        }
        if(number > 1){
            return  ele+"s";
        }
        return "I own no animals";

    }

    public static void flipNHeads(int n) {

        int HeadFlips = 0;
        int count = 0;

        while(HeadFlips !=n) {

            double random = Math.random();

            if (random < .5) {
                System.out.println("TAILS");
                HeadFlips = 0;
                count++;
            }
            if (random >.5) {
                System.out.println("HEADS");
                HeadFlips++;
                count++;
            };
        }
        System.out.println("It took " + count + " flips to flip " + n + " heads in a row.");
    }

public static void clock() {
    int initial = 0;
    int interval = 1000;
    Timer timer = new Timer();
    String time = "HH:mm:ss";

    TimerTask task = new TimerTask() {
        public void run() {
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern(time)));
        }
    };
    timer.scheduleAtFixedRate(task, initial, interval);
}
}


