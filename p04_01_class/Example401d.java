package p04_01_class;

public class Example401d {
    public static void main(String[] args) {
        Gauge g = new Gauge(0);

        while (!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }
}
