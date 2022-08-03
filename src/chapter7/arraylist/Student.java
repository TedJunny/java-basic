package chapter7.arraylist;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Subject> subjects;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

        subjects = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjects.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getScore();
            System.out.println("학생 " + name + "님의 " + subject.getName() + " 과목의 성적은 "
                    + subject.getScore() + "점 입니다.");
        }
        System.out.println("학생 " + name + "님의 총점은 " + total + "점 입니다.");
    }
}
