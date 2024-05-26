package homework4.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Иван", "ИВЧТ", 2, Arrays.asList(5, 4, 3, 4, 2, 2, 3, 4, 5)));
        students.add(new Student("Петр", "ИФСТ", 1, Arrays.asList(5, 3, 4, 2, 5, 4, 4, 5, 5, 5, 5, 5, 5)));
        students.add(new Student("Евгений", "ИФСТ", 2, Arrays.asList(3, 4, 3, 5, 4, 3, 4, 4, 3, 5, 4, 5)));
        students.add(new Student("Владимир", "ИВЧТ", 1, Arrays.asList(2, 3, 2, 2, 3, 2, 3, 2, 2, 3, 4)));

        System.out.println("Все студенты: " + students);

        List<Student> resultStudents = transferStudNextCourse(students, x -> x >= 3, x -> x < 3);

        System.out.println("Перевод на следующий курс и удаление студентов: " + resultStudents);

        System.out.println();

        System.out.println("Печать всех студентов, которые на 3 курсе");
        printStudent(resultStudents, 3);
    }


    //гибкости создания условий для удаления сдудентов и перевода студентов на следующий курс
    @FunctionalInterface
    interface ScoreMoreOrLess {
        boolean scoreMoreOrLess(double a);
    }

    public static void printStudent(List<Student> students, int course) {

        for (Student student : students) {

            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }

    }

    public static List<Student> transferStudNextCourse(List<Student> students, ScoreMoreOrLess nextCourse, ScoreMoreOrLess removeStud) {

        int sum;
        double average;

        List<Student> result = new ArrayList<>(students);

        for (Student student : students) {
            sum = 0;
            for (int score : student.getScores()) {
                sum += score;
            }

            average = (double) sum / student.getScores().size();

            if (nextCourse.scoreMoreOrLess(average)) {
                student.setCourse(student.getCourse() + 1);
            }

            if (removeStud.scoreMoreOrLess(average)) {
                result.remove(student);
            }
        }
        return result;
    }
}



