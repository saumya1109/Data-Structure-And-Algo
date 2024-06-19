public class SimpleHashTable {


   /* We will have problem with just using  Employee array here, as we are just storing employees in the array, we don't know what key the employee is stored at
    So even if we solve the adding elements by implementing linear probing in put method,
    The get method doesn't know which index to look for
    The solution is to make a class that stores both the Key and the Value
    */


    // private Employee[] hashtable;
    private StoredEmployee[] hashtable;


    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        //"Jones"  --> key.length(): 5 && hashtable.length: 10 == 5
        return key.length() % hashtable.length;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        if (occupied(hashedKey)) {
            //We need to set up a stop index
            int stopIndex = hashedKey;
            //if the position that we are checking is the last position in the array we want to go and check front of the array

            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }

        }
        if (occupied(hashedKey)) {
            System.out.println("Sorry, there is already an employee at position " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }


    }

    public boolean occupied(int index) {
        //If there is already an element present at the index, it's going to return true
        return hashtable[index] != null;
    }


    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);

        //if there is no employee present with the key ,there is nothing to remove
        if (hashedKey == -1) {
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;


        //Rehashing
        //<Uncomment this to see the problem>

        //oldHashTable
        StoredEmployee[] oldHashTable = hashtable;
        //New hashTable
        hashtable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }

        return employee;
    }

    private int findKey(String key) {
        //e.g. Jane Jones key --> Jones
        //hashedKey --> 5
        int hashedKey = hashKey(key);

        //If the employee was stored with the initial key
        //hashtable [5] --> key --> 5
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }


        int stopIndex = hashedKey;
        //if the position that we are checking is the last position in the array we want to go and check front of the array

        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        // We would be dropping out of this loop as soon as we hit the null position
        //With linear probing we always put the element on the first available position of the position is filled already,
        //hashedKey --5 (full) --> 6(full) --> 7(full) --> 8(placed)   {This is when we are putting the element}
        // Now when we want to get the element back, as soon as it hits null, it should come out of the loop
        // Because there should be no null values btw original hashedKey and probed HashedKey
        // To solve this 1) re-hash while you're removing  2) Instead of null-ing out we can another field in StoredEmployee as isDeleted

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }


        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }

    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {

            if (hashtable[i] == null) {
                System.out.println("Empty");
            } else {
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }
        }
    }
}
