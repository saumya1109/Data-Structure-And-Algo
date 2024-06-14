public class EmployeeLinkedList {

    //head of the node
    private EmployeeNode head;

    public void addToFront(Employee employee) {

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head= node;
    }

    public void printAllEmployee() {
       EmployeeNode current = head;
        System.out.print("HEAD ->");

        while(current!= null) {
            System.out.print(current);
            System.out.print(" -> ");
           current = current.getNext();
        }
        System.out.println("Null");
    }
 }
