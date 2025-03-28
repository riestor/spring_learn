package spring.learn;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        System.out.println("person bean is created");
    }
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }
    // pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("class person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("class person: setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("class person: setAge");
        this.age = age;
    }
    public void callYourPet() {
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
