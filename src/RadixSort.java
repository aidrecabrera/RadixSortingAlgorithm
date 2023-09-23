import java.util.Arrays;

/**
 * Radix Radicals Radix Sorting Algorithm Implementation
 * This class implements the Radix Sort algorithm for sorting integer arrays.
 * Radix Sort is a non-comparative sorting algorithm that sorts numbers based on their digits.
 *
 * @author Aidre Love S. Cabrera
 * @version 1.06
 */
class RadixSort {

    /**
     * Sorts an array using the counting sort algorithm for a specific digit position.
     *
     * @param array The array to be sorted.
     * @param size  The size of the array.
     * @param place The current digit position for sorting.
     */
    void countingSort(int[] array, int size, int place) {
        // Create temporary arrays and variables for sorting.
        int[] output = new int[size + 1];
        int max = array[0];

        // Find the maximum element in the array.
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }

        // Create an array to store counts of elements at each digit position.
        int[] count = new int[max + 1];

        // Initialize the count array.
        for (int i = 0; i < max; ++i)
            count[i] = 0;

        // Count the occurrences of elements at the current digit position.
        for (int i = 0; i < size; i++)
            count[(array[i] / place) % 10]++;

        // Perform a cumulative sum on the count array.
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Sort elements into the output array based on their digit.
        for (int i = size - 1; i >= 0; i--) {
            output[count[(array[i] / place) % 10] - 1] = array[i];
            count[(array[i] / place) % 10]--;
        }

        // Copy the sorted output array back into the original array.
        if (size >= 0) System.arraycopy(output, 0, array, 0, size);
    }

    /**
     * Find the maximum element in an array.
     *
     * @param array The array to find the maximum element from.
     * @param n     The size of the array.
     * @return The maximum element in the array.
     */
    int getMax(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    /**
     * Sorts an integer array using the Radix Sort algorithm.
     *
     * @param array The array to be sorted.
     * @param size  The size of the array.
     */
    void radixSort(int[] array, int size) {
        // Find the maximum element in the array.
        int max = getMax(array, size);

        // Iterate through each digit position, from right to left.
        for (int place = 1; max / place > 0; place *= 10)
            countingSort(array, size, place);
    }

    public static void main(String[] args) {
        int[] data = { 274, 1024, 1377, 2698, 1936, 749, 1157, 2106, 2424, 1854 };
        int size = data.length;
        RadixSort rs = new RadixSort();
        rs.radixSort(data, size);
        System.out.println(Arrays.toString(data));
    }
}
