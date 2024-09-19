package p05_01_object_oriented_programming;

public class Example501b {
    public static void main(String[] args) {
        Timer timer = new Timer(); 

        while (true) {
            System.out.println(timer);

            timer.advance();

            try {
                Thread.sleep(10); 
            } catch (Exception e) {

            }
        }
    }
}
