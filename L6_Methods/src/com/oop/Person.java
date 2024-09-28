package com.oop;

public class Person {
  private String name;
  private int age;
  
  private static int count = 0;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    count++;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static int getCountPersons() {
    return count;
  }
}
