package org.example.BuilderPattern.CustomStudySession;

public class StudySessionBuilder {
    private String subject;
    private double duration;
    private int difficutlyLevel;
    private boolean backgroundMusicOnOff;
    private int breakInterval;
    private boolean notesEnabledOrdisabled;

    public StudySessionBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public StudySessionBuilder setNotesEnabledOrdisabled(boolean notesEnabledOrdisabled) {
        this.notesEnabledOrdisabled = notesEnabledOrdisabled;
        return this;
    }

    public StudySessionBuilder setBreakInterval(int breakInterval) {
        this.breakInterval = breakInterval;
        return this;
    }

    public StudySessionBuilder setBackgroundMusicOnOff(boolean backgroundMusicOnOff) {
        this.backgroundMusicOnOff = backgroundMusicOnOff;
        return this;
    }

    public StudySessionBuilder setDifficutlyLevel(int difficutlyLevel) {
        this.difficutlyLevel = difficutlyLevel;
        return this;
    }

    public StudySessionBuilder setDuration(double duration) {
        this.duration = duration;
        return this;
    }
    public StudySession build(){
        return new StudySession( subject,  duration, difficutlyLevel, backgroundMusicOnOff, breakInterval, notesEnabledOrdisabled);
    }
}
