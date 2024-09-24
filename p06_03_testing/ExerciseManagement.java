package p06_03_testing;

import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises; 

    public ExerciseManagement() {
        this.exercises = new ArrayList<Exercise>(); 
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> exerciseList = new ArrayList<String>(); 

        for (Exercise exerciseItem:this.exercises) {
            exerciseList.add(exerciseItem.getName()); 
        }

        return exerciseList;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise)); 
    }

    public void markAsCompleted(String exercise) {
        for (Exercise exerciseItem:this.exercises) {
            if (exerciseItem.getName().equals(exercise)) {
                exerciseItem.setCompleted(true);
                continue; 
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise exerciseItem:this.exercises) {
            if (exerciseItem.isCompleted()) {
                return true; 
            }
        }
        return false;
    }
}
