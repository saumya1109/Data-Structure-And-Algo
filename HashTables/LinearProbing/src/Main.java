public class Main {
    public static void main(String[] args) {


        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee MarySmith = new Employee("Mary", "Smith", 22);
        Employee MikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Jones", janeJones); //5
        hashTable.put("Doe", johnDoe);  // 3
        hashTable.put("Wilson", MikeWilson); //6
        hashTable.put("Smith", MarySmith); // 5 --> Linear Probing --> 6 --> 7
       // hashTable.printHashTable();

        System.out.println("Retrieve key Wilson: "+ hashTable.get("Wilson"));
        System.out.println("Retrieve key Smith: "+ hashTable.get("Smith"));

        hashTable.remove("Wilson");
        hashTable.remove("Jones");

        hashTable.printHashTable();


        // return null if we don't do rehashing
        System.out.println("Retrieve key Smith: "+ hashTable.get("Smith"));



    }
}