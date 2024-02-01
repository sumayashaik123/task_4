import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ATM {
    private Timer timer;
    private boolean submitted;

    public ATM() {
        this.timer = new Timer();
        this.submitted = false;
    }

    public void startTimer(int seconds) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!submitted) {
                    autoSubmit();
                }
            }
        }, seconds * 1000);
    }

    public void autoSubmit() {
        System.out.println("Auto-submitting...");

    
        submitted = true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ATM atm = new ATM();
        atm.startTimer(5);

        System.out.println("Answer the questions within the time limit.");

        
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is 2 + 2?", new String[]{"3", "4", "5"}, 1);
        question1.presentQuestion();

        if (question1.selectAnswer()) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }

        
        atm.timer.cancel();
    }
}
