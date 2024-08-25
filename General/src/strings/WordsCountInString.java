package strings;

public class WordsCountInString {
    public static int wordCountInString(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] wordCount = input.split("\\s+");
        return wordCount.length;
    }

    public static void main(String[] args) {
        System.out.println("Word count in a string.");

        String inputString = "Java is a object oriented programming language.";

        int count = wordCountInString(inputString);

        System.out.println("Count: " + count);

    }
}
