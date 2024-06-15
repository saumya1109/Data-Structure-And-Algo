import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;


    //capacity would be maximum number of elements that we can store in the stack
    //Since this is backed by an array (static)
    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {

        //O(n) --> worst case
        if (top == stack.length) {
            // need to resize the backing array

            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;

        }

        stack[top++] = employee;
    }

    public Employee pop() {
        // There will be a memory wastage with this approach
        // if we have initially 20 elements --> resized to 40--> popped 30 values --> we would be having 40 capacity of array holding only 10 items

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        //there is nothing at top, the top is only indicating to the next element at top
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        // There will be a memory wastage with this approach
        // if we have initially 20 elements --> resized to 40--> popped 30 values --> we would be having 40 capacity of array holding only 10 items

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        //there is nothing at top, the top is only indicating to the next element at top


        return stack[top - 1];
    }


    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for(int i=top-1;i >=0;i--) {
            System.out.println(stack[i]);
        }
    }
}
