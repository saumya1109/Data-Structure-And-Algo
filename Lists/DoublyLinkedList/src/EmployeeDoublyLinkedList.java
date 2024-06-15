public class EmployeeDoublyLinkedList {

    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    int size;

    public void addToFront(Employee employee) {

        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        // The previous field of the first element will always be null
        node.setNext(head);
        //if the list is empty we need to make sure that the head and tail is pointing to that node.
        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
        }

        head = node;
        size++;

    }

    public void addToEnd(Employee employee) {
        //Creating a new node
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;

    }

    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }


    public EmployeeDoublyNode removeFromEnd() {

        //nothing to remove
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removedNode = tail;


        if (tail.getPrev() == null) {
            //only one node in the list
            head = null;
        } else {
            tail.getPrev().setNext(null);
        }

        tail = tail.getPrev();
        size--;
        removedNode.setPrev(null);
        return removedNode;
    }


    public void printEmployees() {
        EmployeeDoublyNode current = head;
        System.out.print("HEAD ->");
        while (current != null) {
            System.out.println("prev-" + current.getPrev());
            System.out.println(current);
            System.out.println("next-" + current.getNext());
            System.out.println();
            System.out.print(" <=> ");
            current = current.getNext();

        }
        System.out.println("TAIL");
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {


        if (head == null) {
            return false;
        }

        //find the existing employee
        EmployeeDoublyNode current = head;
        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }
        if (current == null) {
            return false;
        }


        EmployeeDoublyNode newEmployeeNode = new EmployeeDoublyNode(newEmployee);
        newEmployeeNode.setPrev(current.getPrev());
        newEmployeeNode.setNext(current);
        current.getPrev().setNext(newEmployeeNode);

        if (head == current) {
            head = newEmployeeNode;
        } else {
            newEmployeeNode.getPrev().setNext(newEmployeeNode);
        }

        size++;


        return true;
    }

    public void getSize() {
        System.out.println(size);
    }

    public boolean isEmpty() {
        return head == null;
    }
}
