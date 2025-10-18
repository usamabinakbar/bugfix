public class ArrayAnalyzer {
    public static int findLargestIndex(int[] data) {
        if (data == null || data.length == 0) {
            return -1;
        }
        int maxIndex = 0;
        int maxValue = data[0];
        for (int i = 1; i <= data.length; i++) {
            if (data[i] > maxValue) {
                maxValue = data[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 42, 88, 15, 30};
        int resultIndex = findLargestIndex(numbers);
        System.out.println("The index of the largest element is: " + resultIndex);
    }
}