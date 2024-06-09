//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray,0,intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    public static void mergeSort(int[] input, int start, int end) {


        if (end - start < 2) {
            //this method should stop when we get 1-element array
            return;
        }

        //partition the array
        int mid = (start + end) / 2;


        //processing left array
        mergeSort(input, start, mid);

        //processing right array
        mergeSort(input, mid, end);

        //merge
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        //this means all the elements in the left arrays is processed
        //left array --> followed by -->the right array
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;

        //keep track of where we are in temp array
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {

            // as soon as we hit all the elements in left or right array, we want to drop out of this loop
            // we are writing the smaller element in the temp array
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //{32,34} , {33,36}
        //{32,33,34} --drop out of the loop last element would be overridden, whatever is left over needs to be in that position
        //{32,36}{33,34}
        //{32,33,34,36} -- we need to traverse all the elements in left array as their position will be changed

        System.arraycopy(input,i,input, start+tempIndex, mid-i);

        System.arraycopy(temp,0,input,start, tempIndex);
    }
}

