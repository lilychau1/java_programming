package p06_01_objects_and_lists;

public class Person {
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public String toString() {
        return this.name + "(" + this.height + " cm)";
    }
}
