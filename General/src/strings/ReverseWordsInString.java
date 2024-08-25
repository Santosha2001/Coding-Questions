package strings;

public class ReverseWordsInString {

    public static void reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]);
            if (i > 0) {
                builder.append(" ");
            }
        }
        System.out.println("Input string: " + input);
        System.out.println("Reversed string: " + builder);
    }

    public static void main(String[] args) {

        reverseWords("Java programming is more interesting");
    }
}
