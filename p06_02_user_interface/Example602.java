package p06_02_user_interface;

import java.util.Scanner;

public class Example602 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
    }
}
