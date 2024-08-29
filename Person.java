public class Person {
   
    String name;
    int age;
    String address;

   
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    
    public static void main(String[] args) {
       
        Person person1 = new Person("renjisha",24,"aaaaaa");
        Person person2 = new Person("Jane Smith", 25, "456 Elm St");

        
        System.out.println("Person 1 Details:");
        person1.displayDetails();

        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();
    }
}
