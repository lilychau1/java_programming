package p05_01_object_oriented_programming;

public class Example501d {
    public static void main(String[] args) {
        Cube cube1 = new Cube(4);

        System.out.println(cube1.volume());
        System.out.println(cube1);

        Cube cube2 = new Cube(2);

        System.out.println(cube2.volume());
        System.out.println(cube2);

    }
}
