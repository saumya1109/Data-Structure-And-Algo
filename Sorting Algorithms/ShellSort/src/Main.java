
public class Main {
    public static void main(String[] args) {
        int [] intArray ={20,35,-15,7,55,1,-22};
    // We are using gap to increase the performance of insertion sort.
        //When the gap is equal to 1 this algo will start working as the insertion sort

        for(int gap= intArray.length /2;gap>0;gap/=2) {

            for(int i=gap;i<intArray.length;i++) {
                int newElement = intArray[i];

                int j=i;

                //we are shifting the array by gap positions and we are decreasing the position of next element by gap

                while(j>=gap && intArray[j-gap]>newElement){
                    intArray[j] = intArray[j-gap];
                    j-=gap;
                }

                intArray[j] = newElement;
            }


        }




        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}