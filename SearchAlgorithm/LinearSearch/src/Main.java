public class Main {

    public static void main(String[] args) {


        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Found number at position: " + search(intArray, -15));
        System.out.println("Found number at position: " + search(intArray, 1));
        System.out.println("Found number at position: " + search(intArray, 8888));



    }

    public static int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return i;
            }
        }

        return -1;
    }
}

