/**
 * Encapsulation in Object Oriented Programming
 * 
 * Encapsulation is the mechanism that binds together code and the data it manipulates,
 * and keeps both safe from outside interference and misuse. One way to think about
 * encapsulation is as a protective wrapper that prevents the code and data from being
 * arbitrarily accessed by other code defined outside the wrapper.
 * 
 * Encapsulation is used to:
 * - Control the way data is accessed or modified
 * - Prevent data from being modified by unauthorized code
 * - Allow data to be accessed only through getter methods
 * - Protect the integrity of the data
 * 
 * Encapsulation is an important concept in OOP that helps in maintaining the integrity
 * of the data and the code that manipulates it.
 * 
 * References:
 * @see https://www.tutorialspoint.com/java/java_encapsulation.htm
 * @see https://www.geeksforgeeks.org/encapsulation-in-java/
 * @see https://beginnersbook.com/2013/05/encapsulation-in-java/
 * @see https://www.w3schools.com/java/java_encapsulation.asp
 */
package com.oop.BasicOOP;

/**
 * The `Dog` class is a blueprint for creating objects of type `Dog`. It is a
 * child class of the `Mammal` class, and it inherits the properties and methods
 * of the `Mammal` class.
 * 
 * @see com.oop.BasicOOP.Mammal
 */
public class Dog extends Mammal {
    /**
     * Member variables or attributes of the `Dog` class.
     */
    private String breed;
    private String barkingSound;
    private boolean tailWagging;
    private boolean isTrained;

    /**
     * Constructor for the `Dog` class.
     * 
     * @param name          the name of the dog
     * @param species       the species of the dog
     * @param age           the age of the dog
     * @param weight        the weight of the dog
     * @param color         the color of the dog
     * @param habitat       the habitat of the dog
     * @param x             the x-coordinate of the dog
     * @param y             the y-coordinate of the dog
     * @param fur           the fur of the dog
     * @param milk          whether the dog produces milk
     * @param isWarmBlooded whether the dog is warm-blooded
     * @param canGiveBirth  whether the dog can give birth
     * @param breed         the breed of the dog
     * @param barkingSound  the barking sound of the dog
     * @param tailWagging   whether the dog wags its tail
     * @param isTrained     whether the dog is trained
     */
    Dog(String name, String species, int age, int weight, String color, String habitat, int x, int y, String fur,
            boolean milk, boolean isWarmBlooded, boolean canGiveBirth, String breed, String barkingSound,
            boolean tailWagging,
            boolean isTrained) {
        super(name, species, age, weight, color, habitat, x, y, fur, milk, isWarmBlooded, canGiveBirth);
        this.breed = breed;
        this.barkingSound = barkingSound;
        this.tailWagging = tailWagging;
        this.isTrained = isTrained;
    }

    /**
     * Encapsulation in OOP is the concept of restricting access to certain parts of
     * an object, such as variables and methods, to prevent unauthorized access and
     * modification. In Java, encapsulation is achieved using access modifiers such
     * as `private`, `protected`, and `public`.
     * 
     * In order to access the private member variables of a class, we can use
     * getter and setter methods. Getter methods are used to access the value of a
     * private variable, and setter methods are used to set the value of a private
     * variable.
     *
     * References:
     * 
     * @see https://www.tutorialspoint.com/java/java_encapsulation.htm
     * @see https://www.geeksforgeeks.org/encapsulation-in-java/
     * @see https://beginnersbook.com/2013/05/encapsulation-in-java/
     * @see https://www.w3schools.com/java/java_encapsulation.asp
     * @see https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
     * @see https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html
     */

    /**
     * Getter method for the `breed` member variable.
     * 
     * @return a {@link String} - the breed of the dog
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Setter method for the `breed` member variable.
     * 
     * @param breed - the breed of the dog
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Getter method for the `barkingSound` member variable.
     * 
     * @return a {@link String} - the barking sound of the dog
     */
    public String getBarkingSound() {
        return barkingSound;
    }

    /**
     * Setter method for the `barkingSound` member variable.
     * 
     * @param barkingSound - the barking sound of the dog
     */
    public void setBarkingSound(String barkingSound) {
        this.barkingSound = barkingSound;
    }

    /**
     * Getter method for the `tailWagging` member variable.
     * 
     * @return a {@link boolean} - whether the dog wags its tail
     */
    public boolean isTailWagging() {
        return tailWagging;
    }

    /**
     * Setter method for the `tailWagging` member variable.
     * 
     * @param tailWagging - whether the dog wags its tail
     */
    public void setTailWagging(boolean tailWagging) {
        this.tailWagging = tailWagging;
    }

    /**
     * Getter method for the `isTrained` member variable.
     * 
     * @return a {@link boolean} - whether the dog is trained
     */
    public boolean isTrained() {
        return isTrained;
    }

    /**
     * Setter method for the `isTrained` member variable.
     * 
     * @param isTrained - whether the dog is trained
     */
    public void setTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    /**
     * Method to make the dog bark.
     */
    public void bark() {
        System.out.println("The dog barks: " + barkingSound);
    }

    /**
     * Method to make the dog fetch the ball.
     * 
     * If the dog is trained, it fetches the ball; otherwise, it does not fetch the
     * ball.
     */
    public void fetch() {
        if (this.isTrained) {
            System.out.println("The dog fetches the ball.");
        } else {
            System.out.println("The dog is not trained to fetch.");
        }
    }

    /**
     * Method to make the dog wag its tail.
     * 
     * If the dog is wagging its tail, it wags its tail; otherwise, it does not wag
     * its tail.
     */
    public void wagTail() {
        if (this.tailWagging) {
            System.out.println("The dog wags its tail.");
        } else {
            System.out.println("The dog is not wagging its tail.");
        }
    }

    /**
     * Method to make the dog sit.
     * 
     * If the dog is trained, it sits; otherwise, it does not sit.
     */
    public void sit() {
        if (this.isTrained) {
            System.out.println("The dog sits.");
        } else {
            System.out.println("The dog is not trained to sit.");
        }
    }
}
