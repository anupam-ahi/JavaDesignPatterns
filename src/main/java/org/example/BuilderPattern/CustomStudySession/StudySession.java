package org.example.BuilderPattern.CustomStudySession;

public class StudySession {
    private final String subject;
    private final double duration;
    private final int difficutlyLevel;
    private final boolean backgroundMusicOnOff;
    private final int breakInterval;
    private final boolean notesEnabledOrdisabled;

    StudySession(String subject, double duration, int difficutlyLevel, boolean backgroundMusicOnOff, int breakInterval, boolean notesEnabledOrdisabled) {
        this.subject = subject;
        this.duration = duration;
        this.difficutlyLevel = difficutlyLevel;
        this.backgroundMusicOnOff = backgroundMusicOnOff;
        this.breakInterval = breakInterval;
        this.notesEnabledOrdisabled = notesEnabledOrdisabled;
    }

    @Override
    public String toString() {
        return "StudySession{" +
                "subject='" + subject + '\'' +
                ", duration=" + duration +
                ", difficutlyLevel=" + difficutlyLevel +
                ", backgroundMusicOnOff=" + backgroundMusicOnOff +
                ", breakInterval=" + breakInterval +
                ", notesEnabledOrdisabled=" + notesEnabledOrdisabled +
                '}';
    }
}
