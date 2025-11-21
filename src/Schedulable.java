import java.time.LocalTime;

public interface Schedulable {
    LocalTime getScheduledTime();
    void setScheduledTime(LocalTime scheduledTime);
}
