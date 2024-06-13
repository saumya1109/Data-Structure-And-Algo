import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        // Implements Dual Pivot Quick sort
        // offers O(nlog(n))
        Arrays.sort(intArray);


        // Uses threads so this is ideak for large volume of data
        Arrays.parallelSort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }
}