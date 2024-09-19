package p04_03_files_and_reading_data;

public class Person {
    private String name;
    private int age;

    public Person(String personName, int personAge) {
        this.name = personName;
        this.age = personAge;
    }

    public String toString() {
        if (this.age > 1) {
            return this.name + ", age: " + this.age + " years";
        } else {
        return this.name + ", age: " + this.age + " year";
        }
    }
}
