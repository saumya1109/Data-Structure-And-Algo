public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee MarySmith = new Employee("Mary", "Smith", 22);
        Employee MikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Jones",janeJones);
        hashTable.put("Doe",johnDoe);
        hashTable.put("Wilson",MikeWilson);


        //Will cause collision
        hashTable.put("Smith",MarySmith);
        hashTable.printHashTable();

        System.out.println(hashTable.get("Wilson"));

        //Not gonna work; Will not return null
        System.out.println(hashTable.get("End"));

    }
}