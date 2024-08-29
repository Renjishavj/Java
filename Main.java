// 1.Single Inheritance

// class Animal {
//     void eat() {
//         System.out.println("This animal eats.");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat();
//         dog.bark();
//     }
// }



// 2.multilevel Inheritance

class Animal {
    void eat() {
        System.out.println("This animal eats.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}


// 3.Hierarchical Inheritance

// class Animal {
//     void eat() {
//         System.out.println("This animal eats.");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks.");
//     }
// }
// class Cat extends Animal {
//     void meow() {
//         System.out.println("The cat meows.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         Cat cat = new Cat();
//         dog.eat();
//         dog.bark();
//         cat.eat();
//         cat.meow();
//     }
// }

// 4.Multiple Inheritance

// interface CanFly {
//     void fly();
// }

// interface CanSwim {
//     void swim();
// }

// class Duck implements CanFly, CanSwim {
//     public void fly() {
//         System.out.println("The duck flies.");
//     }

//     public void swim() {
//         System.out.println("The duck swims.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Duck duck = new Duck();
//         duck.fly();
//         duck.swim();
//     }
// }


// 5.Hybrid Inheritance
// interface Animal {
//     void eat();
// }
// interface Mammal extends Animal {
//     void walk();
// }
// interface Bird extends Animal {
//     void fly();
// }
// class Bat implements Mammal, Bird {
//     public void eat() {
//         System.out.println("The bat eats.");
//     }

//     public void walk() {
//         System.out.println("The bat walks.");
//     }

//     public void fly() {
//         System.out.println("The bat flies.");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Bat bat = new Bat();
//         bat.eat();
//         bat.walk();
//         bat.fly();
//     }
// }

