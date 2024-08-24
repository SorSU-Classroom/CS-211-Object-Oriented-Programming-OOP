/**
 * Inheritance in Object Oriented Programming
 * 
 * Inheritance is a mechanism in which one object acquires all the properties and behaviors
 * of a parent object. It allows a class to inherit the properties and methods of another class.
 * 
 * The class which inherits the properties and methods is known as the child class, and the class
 * whose properties and methods are inherited is known as the parent class.
 * 
 * Inheritance is an important feature of OOP that allows code reusability and reduces the complexity
 * of a program.
 * 
 * References:
 * @see https://www.tutorialspoint.com/java/java_inheritance.htm
 * @see https://www.geeksforgeeks.org/inheritance-in-java/
 * @see https://www.javatpoint.com/inheritance-in-java
 */
package com.oop.BasicOOP;

/**
 * Mammal is a child class of the Animal class. It inherits the properties and
 * methods of the Animal class.
 * 
 * @see com.oop.BasicOOP.Animal
 */
public class Mammal extends Animal {
    /**
     * Member variables or attributes of the `Mammal` class.
     */
    String fur;
    boolean milk;
    boolean isWarmBlooded;
    boolean canGiveBirth;

    /**
     * A class in Java can have multiple constructors with different parameters.
     * This is an example of method overloading, where the `Mammal` class has two
     * or more constructors with different parameters.
     * 
     * References:
     * 
     * @see https://www.w3schools.com/java/java_constructors.asp
     * @see https://www.geeksforgeeks.org/constructor-overloading-java/
     * @see https://www.javatpoint.com/constructor-overloading-in-java
     * @see https://beginnersbook.com/2013/05/method-overloading/
     */

    /**
     * This constructor initializes the member variables of the `Mammal` class.
     * This constructor calls the constructor of the parent class (`Animal`) using
     * the `super` keyword.
     * 
     * References:
     * 
     * @see https://www.geeksforgeeks.org/inheritance-in-java/
     * @see https://www.tutorialspoint.com/java/java_object_classes.htm
     * @see https://www.w3schools.com/java/java_constructors.asp
     * @see https://www.w3schools.com/java/java_inheritance.asp
     */
    Mammal(String name, String species, int age, int weight, String color, String habitat, int x, int y) {
        super(name, species, age, weight, color, habitat, x, y);
    }

    /**
     * This is another constructor for the `Mammal` class that initializes the
     * member variables of the `Mammal` class as well as the `Animal` class.
     * 
     * References:
     * 
     * @see https://www.geeksforgeeks.org/constructor-overloading-java/
     * @see https://www.javatpoint.com/constructor-overloading-in-java
     * @see https://beginnersbook.com/2013/05/method-overloading/
     * @see https://www.geeksforgeeks.org/inheritance-in-java/
     * @see https://www.tutorialspoint.com/java/java_object_classes.htm
     * @see https://www.w3schools.com/java/java_constructors.asp
     * 
     * @param name          The name of the mammal.
     * @param species       The species of the mammal.
     * @param age           The age of the mammal.
     * @param weight        The weight of the mammal.
     * @param color         The color of the mammal.
     * @param habitat       The habitat of the mammal.
     * @param x             The x-coordinate of the mammal.
     * @param y             The y-coordinate of the mammal.
     * @param fur           The fur of the mammal.
     * @param milk          The milk production of the mammal.
     * @param isWarmBlooded The warm-blooded nature of the mammal.
     * @param canGiveBirth  The ability of the mammal to give birth.
     */
    Mammal(String name, String species, int age, int weight, String color, String habitat, int x, int y, String fur,
            boolean milk, boolean isWarmBlooded, boolean canGiveBirth) {
        super(name, species, age, weight, color, habitat, x, y);
        this.fur = fur;
        this.milk = milk;
        this.isWarmBlooded = isWarmBlooded;
        this.canGiveBirth = canGiveBirth;
    }

    /**
     * This method makes the mammal give birth.
     */
    void giveBirth() {
        if (this.age >= 2 && this.canGiveBirth) {
            System.out.println(this.name + " is giving birth.");
        } else {
            System.out.println(this.name + " is too young to give birth.");
        }
    }
}