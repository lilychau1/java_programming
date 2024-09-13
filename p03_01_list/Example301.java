package p03_01_list;

import java.util.ArrayList;

public class Example301 {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>(); 

        wordList.add("First"); 
        wordList.add("Second"); 
        wordList.add("Third"); 

        wordList.remove("Third");

        int numberOfWords = wordList.size();

        System.out.println(wordList.get(0));
        System.out.println(wordList.get(1));
        System.out.println("List contains 'First': " + wordList.contains("First"));
        System.out.println("Number of words: " + numberOfWords);
    }
}
