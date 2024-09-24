package p06_02_user_interface;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes; 

    public JokeManager() {
        this.jokes = new ArrayList<String>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke); 
    }

    public String drawJoke() {
        return this.jokes.get(new Random().nextInt(this.jokes.size())); 
    }

    public void printJokes() {
        for (String joke:this.jokes) {
            System.out.println(joke);
        }
    }
}
