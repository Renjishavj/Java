public class Student {
  
    String name;
    int age;
    String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    
    public static void main(String[] args) {
        
        Student[] students = new Student[3];

        
        students[0] = new Student("Alice", 20, "Computer Science");
        students[1] = new Student("Bob", 22, "Mechanical Engineering");
        students[2] = new Student("Charlie", 19, "Physics");

        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            students[i].displayDetails();
            System.out.println();
        }
    }
}
