//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList employeeDoublyLinkedList = new EmployeeDoublyLinkedList();

        employeeDoublyLinkedList.addToFront(janeJones);
        employeeDoublyLinkedList.addToFront(johnDoe);
        employeeDoublyLinkedList.addToFront(marySmith);
        employeeDoublyLinkedList.addToFront(mikeWilson);


        //print Employees
        employeeDoublyLinkedList.printEmployees();

        // Get Size
        employeeDoublyLinkedList.getSize();

        //Making a new Employee
        Employee billEnd = new Employee("Bill", "End", 78);

        //Making a new Employee
        Employee zackNowark = new Employee("Zack", "Nowark", 1345);

        // Adding bill to the end of the list
        employeeDoublyLinkedList.addToEnd(billEnd);


        // Removing The first element from the list
        employeeDoublyLinkedList.removeFromFront();


        // Removing from the End of the List
        employeeDoublyLinkedList.removeFromEnd();


        //Adding an element before Mary Smith
        employeeDoublyLinkedList.addBefore(zackNowark, marySmith);

        employeeDoublyLinkedList.printEmployees();


    }
}