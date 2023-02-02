package de.brightslearning.java.advanced.designpattern.di;

public class Person implements Comparable<Person>{
    private Integer age;
    private String firstName;

    public Person(String o, int age) {
        this.firstName = o;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.age.compareTo(otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
