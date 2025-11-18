import java.time.LocalDateTime;
import java.util.Objects;

public class OscarsEvent {
    // Data fields
    private String name;
    private String venue;
    private String host;
    private int duration;
    private LocalDateTime dateTime;


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getVenue() {
        return venue;
    }

    public String getHost() {
        return host;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    // Constructor
    public OscarsEvent(String name, String venue, String host, int duration, LocalDateTime dateTime) {
        setName(name);
        setVenue(venue);
        setHost(host);
        setDuration(duration);
        setDateTime(dateTime);
    }

    // Overridden methods

    @Override
    public String toString() {
        return "OscarsEvent{" +
                "name='" + name + '\'' +
                ", venue='" + venue + '\'' +
                ", host='" + host + '\'' +
                ", duration=" + duration +
                ", date and time=" + dateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof OscarsEvent that)) return false;
        return duration == that.duration && Objects.equals(name, that.name) && Objects.equals(venue, that.venue) && Objects.equals(host, that.host) && Objects.equals(dateTime, that.dateTime);
    } // I used intellij to automatically generate the equals method

}
