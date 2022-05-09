import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = new int[10];
        Random rand = new Random();
        for (int i = 0; i < unsorted.length; i++) {
            unsorted[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(unsorted) + "\n");

        int[] sorted = sort(unsorted);

        System.out.println("\n" + Arrays.toString(sorted));
    }

    public static int[] sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length-1; i++) {
            int cacheJ = i, cacheUS = unsorted[i];
            for (int j = i; j < unsorted.length; j++) {
                if(cacheUS > unsorted[j]) {
                    cacheUS = unsorted[j];
                    cacheJ = j;
                }
            }
            unsorted[cacheJ] = unsorted[i];
            unsorted[i] = cacheUS;
            System.out.println(Arrays.toString(unsorted));
        }
        return unsorted;
    }
}
