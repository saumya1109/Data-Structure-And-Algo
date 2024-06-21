public class Main {
    public static void main(String[] args) {


        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        int index = recursiveBinarySearch(intArray, 35);
        System.out.println("Found the number at index " + index);
    }

    public static int iterativeBinarySearch(int[] input, int number) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("midpoint = " + midpoint);

            if (input[midpoint] == number) {
                return midpoint;
            } else if (input[midpoint] < number) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int num) {
        return recursiveBinarySearch(array, 0, array.length, num);
    }

    private static int recursiveBinarySearch(int[] array, int start, int end, int num) {
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) / 2;
        System.out.println("midpoint = " + midpoint);

        if (array[midpoint] == num) {
            return midpoint;
        } else if (array[midpoint] < num) {
            return recursiveBinarySearch(array, midpoint + 1, end, num);
        } else {
            return recursiveBinarySearch(array, start, midpoint, num);
        }

    }
}