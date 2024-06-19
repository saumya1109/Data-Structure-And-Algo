import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    // Chaining :Instead of storing the values into the array, each array position contains a linked list

    //We need array of linkedlist

    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];

        for (int i = 0; i < hashTable.length; i++) {
            //[list1<Employee>, list2<Employee>, list3<Employee>, list4<Employee>]
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {

        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));

    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);

        //Search the linked list for the hashedkey.
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                return employee.employee;
            }

        }
        //No matches found
        return null;

    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) {
                break;
            }

        }
        if (employee == null) {
            return null;
        } else {
            hashTable[hashedKey].remove(index);
            return employee.employee;
        }

    }

    private int hashKey(String key) {


       // return key.length() % hashTable.length;
        return Math.abs(key.hashCode() % hashTable.length);
    }


    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {

            if (hashTable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");

                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.print("-->");
                }

                System.out.println("Null");

            }

        }
    }
}
