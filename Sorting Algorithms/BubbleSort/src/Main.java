//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] intArray ={20,35,-15,7,55,1,-22};

        // our assumption is in the beginning the array is unsorted so
        // we will be initializing the last unsortedIndex by the length of the array

        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            /*
            sorted partition is growing from right to left
            bubble the largest element at the end of the list
            */

        //going from left to right
            for(int i=0;i<lastUnsortedIndex;i++){
                if(intArray[i]>intArray[i+1]){
                    swap(intArray,i,i+1);
                }
            }

        }

    for(int i=0;i<intArray.length;i++){
        System.out.println(intArray[i]);
    }

    }



        public static void swap(int [] array, int i,int j) {
            if(i==j){
                return;
                //No element is actually there to swap
            }
            int temp= array[i];
            array[i]=array[j];
            array[j]=temp;

            //swapping here
        }


}