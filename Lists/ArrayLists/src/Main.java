import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        // Retrieval is fast as the elements would be indexed.
        // Slow if inserting/removing elements at any position other than the last position of the array
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));


        //O(1) because every element is indexed
        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        //To replace an item in the list
        employeeList.set(1, new Employee("John", "Adams", 4568));

        System.out.println(employeeList.size());


        // worst case would be O(n), because elements needs to be shifted
        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        // If we want the array that holds the list we can call .toArray method
        // By default it returns the Object array, so if we want it o be Employee Array we need to pass that in tha parameters
        Employee[] array = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employees : array) {
            System.out.println(employees);
        }

        //if the list contains an instance
        //without the.equals method this would still return false
        // these methods are good for searching algorithm
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        System.out.println(employeeList.indexOf(new Employee("Mary", "Smith", 22)));

        //removing any element
        // this will requires some shifting which will make it slow
        employeeList.remove(2);
    }


}