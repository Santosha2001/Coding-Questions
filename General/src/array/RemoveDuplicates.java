package array;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] original = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        int[] unique = new int[original.length];
        int uniqueCount = 0;
        String duplicates = "";

        for (int i = 0; i < original.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (original[i] == unique[j]) {
                    isDuplicate = true;
                    if (!duplicates.contains(String.valueOf(original[i]))) {
                        duplicates += original[i] + " ";
                    }
                    break;
                }
            }
            if (!isDuplicate) {
                unique[uniqueCount++] = original[i];
            }
        }

        System.out.print("Unique elements: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();

        System.out.println("Duplicate elements: " + duplicates);
    }
}
