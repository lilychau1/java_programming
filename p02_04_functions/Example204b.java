package p02_04_functions;

public class Example204b {
    public static void main(String[] args) {
        sum(3, 5); 
        int number1 = 2;
        int number2 = 4; 

        sum(number1, number2);
    }

    public static void sum(int first, int second) {
        System.out.println("" + first + " + " + second + " = " + (first + second));
    }
}
