package p05_02_method_overloading;

public class Example502b {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println(counter1); 

        counter1.increase();
        System.out.println(counter1); 

        counter1.increase(3); 
        System.out.println(counter1); 

        counter1.decrease();
        System.out.println(counter1); 

        counter1.decrease(3); 
        System.out.println(counter1); 

    }
}
