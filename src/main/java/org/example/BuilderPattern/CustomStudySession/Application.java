package org.example.BuilderPattern.CustomStudySession;

public class Application {
    public static void main(String[] args) {
        StudySession ss = new StudySessionBuilder().setDuration(2.0).build();
        System.out.println(ss.toString());
    }
}
