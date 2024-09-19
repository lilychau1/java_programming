package p05_01_object_oriented_programming;

public class Example501 {
    public static void main(String[] args) {
        Clock clock = new Clock(); 

        while (true) {
            System.out.println(clock);

            clock.advance();
        }
    }
}
