package homework4.task4;

import java.util.ArrayList;
import java.util.List;

class Student {

    private String name;
    private String group;
    private int course;
    private List<Integer> scores = new ArrayList<>();

    public Student() {
    }

    public Student(String name, String group, int kurs, List<Integer> scores) {

        for (int score : scores) {
            if (score > 5 || score < 2) {
                throw new IllegalArgumentException("Неправильно введены оценки");
            }
        }

        this.name = name;
        this.group = group;
        this.course = kurs;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void addScore(int score) {

        if (score > 5 || score < 2) {
            this.scores.add(score);
        } else {
            throw new IllegalArgumentException("Вы ввели неправильную оценку! " + score);
        }
    }

    public List<Integer> getScores() {
        return new ArrayList<>(scores);
    }

    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", score=" + scores +
                "}\n";
    }
}