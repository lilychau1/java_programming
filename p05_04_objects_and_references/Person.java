package p05_04_objects_and_references;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String personName, int personAge, int personHeight, int personWeight) {
        this.name = personName;
        this.age = personAge;
        this.height = personHeight;
        this.weight = personWeight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void gainWeight() {
        this.weight++;
    }
    public String toString() {
        if (this.age > 1) {
            return this.name + ", age: " + this.age + " years";
        } else {
        return this.name + ", age: " + this.age + " year";
        }
    }
}
