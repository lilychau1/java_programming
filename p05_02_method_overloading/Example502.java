package p05_02_method_overloading;

public class Example502 {
    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure"); 
        Product plaster = new Product("Plaster", "Home Improvement Section"); 
        Product tyre = new Product("Tyre", 5); 

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);

    }

}
