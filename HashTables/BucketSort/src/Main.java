import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        //printing the array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void bucketSort(int[] array) {

        List<Integer>[] buckets = new List[10];

        // [arrlist1, arrlist2, arrlist3,arrlist4]
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        //Scattering phase
        for (int i = 0; i < array.length; i++) {
            buckets[hash(array[i])].add(array[i]);
        }

        //Sorting Phase
        for (List bucket : buckets) {
            //Uses merge sort
            Collections.sort(bucket);
        }

        //Merging phase
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                array[j++] = value;
            }
        }


    }

    private static int hash(int value) {
        return value / (int) 10;
    }
}
