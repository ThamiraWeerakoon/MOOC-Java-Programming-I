import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> exerciseList = new ArrayList<>();
        for (Exercise exercise : exercises) {
            exerciseList.add(exercise.getName());
        }
        return exerciseList;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise currentExercise : exercises) {
            if (currentExercise.getName().equals(exercise)) {
                currentExercise.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise currentExercise : exercises) {
            if (currentExercise.getName().equals(exercise)) {
                return currentExercise.isCompleted();
            }
        }
        return false;
    }
}
