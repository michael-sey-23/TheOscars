import java.time.LocalTime;
import java.util.Objects;

public class Performer {
    // Data fields
    private String name;
    private String performanceType;
    private String songTitle;
    private int durationMinutes;
    private LocalTime scheduledTime;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setScheduledTime(LocalTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPerformanceType() {
        return performanceType;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public LocalTime getScheduledTime() {
        return scheduledTime;
    }

    // Constructor
    public Performer(String name, String performanceType, String songTitle, int durationMinutes, LocalTime scheduledTime) {
        setName(name);
        setPerformanceType(performanceType);
        setSongTitle(songTitle);
        setDurationMinutes(durationMinutes);
        setScheduledTime(scheduledTime);
    }

    // Overridden methods
    @Override
    public String toString() {
        return "Performer{" +
                "name='" + name + '\'' +
                ", performance type='" + performanceType + '\'' +
                ", song title='" + songTitle + '\'' +
                ", duration in minutes=" + durationMinutes +
                ", scheduled time=" + scheduledTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Performer performer)) return false;
        return durationMinutes == performer.durationMinutes && Objects.equals(name, performer.name) && Objects.equals(performanceType, performer.performanceType) && Objects.equals(songTitle, performer.songTitle) && Objects.equals(scheduledTime, performer.scheduledTime);
    }
}