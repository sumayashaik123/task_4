import java.util.Scanner;

public class MultipleChoiceQuestion {
    private String question;
    private String[] options;
    private int correctAnswerIndex;

    public MultipleChoiceQuestion(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public void presentQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean selectAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select your answer (1-" + options.length + "): ");
        int selectedOptionIndex = scanner.nextInt();

        if (selectedOptionIndex >= 1 && selectedOptionIndex <= options.length) {
            return selectedOptionIndex - 1 == correctAnswerIndex;
        } else {
            System.out.println("Invalid selection. Please choose a valid option.");
            return false;
        }
    }
}
