package p06_01_objects_and_lists;

public class Example601b {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

        System.out.println("============================");
        Stack x = new Stack();
        x.add("1");
        x.add("2");
        x.add("3");
        x.add("4");
        x.add("5");

        while (!x.isEmpty()) {
            System.out.println(x.take());
}
    }
}
