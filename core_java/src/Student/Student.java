package Student;

import java.util.List;

class Student {
    private String name;
    private List<Integer> scores;

    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getScores() {
        return scores;
    }
}
