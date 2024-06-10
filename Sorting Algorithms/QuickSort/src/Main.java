//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            //one element array
            return;
        }

        //else we will find the position of the pivot

        int pivotIndex = partition(input, start, end);
        //sorting the left sub array
        quickSort(input, start, pivotIndex);

        //sorting the right sub array
        quickSort(input, pivotIndex + 1, end);

    }

    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        //i left-> right
        int i = start;
        //j right <- left
        int j = end;

        //we will stop when i crosses j

        while (i < j) {


            //alternating btw i and j

            //Note: empty loop body
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            //Note: empty loop body
            while (i < j && input[++i] <= pivot) ;

            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;

    }

}