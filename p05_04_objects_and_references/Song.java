package p05_04_objects_and_references;

public class Song {
    private String name; 
    private String singer; 
    private int length; 

    public Song(String name, String singer, int length) {
        this.name = name; 
        this.singer = singer; 
        this.length = length; 
    }

    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true; 
        }

        if (!(comparedObject instanceof Song)) {
            return false; 
        }

        Song songCompared = (Song) comparedObject; 

        if (
            this.name.equals(songCompared.name) &&
            this.singer == songCompared.singer &&
            this.length == songCompared.length
        ) {
            return true;
        }

        return false;

    }
}
