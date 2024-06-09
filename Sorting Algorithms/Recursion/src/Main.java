//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }


    // Recursion
    //0! = 1
    //1! = 1* 0!
    //2! = 2*1 = 2*1!
    //3! = 3*2*1= 3*2!
    //4! = 4*3*2*1= 4*3!
    //General Formula: n! = n*(n-1)!


    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;

        }

        return num * recursiveFactorial(num - 1);
    }


    //Iterative way
    public static int iterativeFactorial(int num) {


        if (num == 0) {
            return 1;

        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            num *= i;
        }
        return factorial;
    }
}