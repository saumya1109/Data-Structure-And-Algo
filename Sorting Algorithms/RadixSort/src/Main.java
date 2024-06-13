

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(intArray,10,4);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            //same radix ; same width
            //this method would be moving from least significant to most significant digit
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {

        //stores how many items are we gonna store
        int numItems = input.length;

        int[] countArray = new int[radix];

        for (int value : input) {
            // counting the number of values that have specific digit in the position mentioned
            countArray[getDigit(position, value, radix)]++;
        }

        // adjust the count array, it now contains that have that digit or less than that digit with the position we are working with
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];

        //temporary array
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]]
                    = input[tempIndex];
        }

        //copying back to original array

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }


    }

    private static int getDigit(int position, int value, int radix) {
        //4725 --> 4725/10 --> 472 %10 --> 2
        return value / (int) Math.pow(radix, position) % radix;
    }
}