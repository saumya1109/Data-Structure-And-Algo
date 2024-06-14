public class EmployeeDoublyNode {

    private Employee employee;

    private EmployeeDoublyNode prev;
    private EmployeeDoublyNode next;

    public EmployeeDoublyNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoublyNode getPrev() {
        return prev;
    }

    public void setPrev(EmployeeDoublyNode prev) {
        this.prev = prev;
    }

    public EmployeeDoublyNode getNext() {
        return next;
    }

    public void setNext(EmployeeDoublyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
