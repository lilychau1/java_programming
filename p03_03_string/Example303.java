package p03_03_string;

public class Example303 {
    public static void main(String[] args) {
        String text = "Hello, world!"; 
        char character = text.charAt(0); 
        String[] parts = text.split(", ");
        int length = text.length();

        System.out.println("character: " + character);
        System.out.println("parts: " + parts[0] + ", " + parts[1]);
        System.out.println("length: " + length);
    }
    
}
