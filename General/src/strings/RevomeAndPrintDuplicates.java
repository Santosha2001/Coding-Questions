package strings;

public class RevomeAndPrintDuplicates {

    public static void main(String[] args) {

        String original = "Hello, world";
        String result = "";
        String duplicates = "";

        /*for (int i=0; i<original.length(); i++){
            char c = original.charAt(i);
            if(!result.contains(String.valueOf(c))){
                result+=c;
            } else {
                duplicates+=c;
            }
            System.out.print(c);
            System.out.println(" duplicates: " + duplicates);
            System.out.println("result: " + result);
            System.out.println("____________");

        }*/

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            boolean isDuplicate = false;

            // Check if the character is already in the result string
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == c) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the character is not a duplicate, add it to the result string
            if (!isDuplicate) {
                result += c;
            } else {
                // Check if the character is already in the duplicates string
                boolean alreadyPrinted = false;
                for (int k = 0; k < duplicates.length(); k++) {
                    if (duplicates.charAt(k) == c) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                // If not already printed, add it to the duplicates string
                if (!alreadyPrinted) {
                    duplicates += c;
                }
            }
        }
        System.out.println("Original string: " + original);
        System.out.println("Result string without duplicates: " + result);
        System.out.println("Duplicates: " + duplicates);


    }
}
