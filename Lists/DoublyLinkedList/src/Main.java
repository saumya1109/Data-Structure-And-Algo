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

       // employeeDoublyLinkedList.printEmployees();

        employeeDoublyLinkedList.getSize();

        Employee billEnd = new Employee("Bill", "End", 78);
        employeeDoublyLinkedList.addToEnd(billEnd);

     //   employeeDoublyLinkedList.printEmployees();

        employeeDoublyLinkedList.removeFromFront();
        employeeDoublyLinkedList.removeFromEnd();

        employeeDoublyLinkedList.printEmployees();
    }
}