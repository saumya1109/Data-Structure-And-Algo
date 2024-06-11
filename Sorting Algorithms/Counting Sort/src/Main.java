//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] intArray={2,5,9,8,2,8,7,10,4,3};

        countingSort(intArray,0,10);

        for(int i=0;i<intArray.length;i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void countingSort(int [] input, int min, int max) {
        //create counting array
        int[] countArray  = new int[(max- min)+1];

        //translating the value that we want to count into its index int the count Array
        for(int i=0;i< input.length;i++ ) {

            //e.g. suppose we the value we are incrementing is 5 then 5-1 =4 (increment 4th index)

            countArray[input[i]- min]++;


        }

         // j is to write to intArray
         // i is being used for traversing the count array
        int j=0;
         for(int i= min;i<= max;i++) {
                while( countArray[i - min] >0) {
                    input[j++] = i;
                    countArray[i- min] --;
                }
         }
    }
}