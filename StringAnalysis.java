import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int alphabetCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else {
                specialCharCount++;
            }
        }

        System.out.println("Number of alphabets: " + alphabetCount);
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Number of special characters: " + specialCharCount);

        scanner.close();
    }
}
