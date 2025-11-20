import java.time.LocalDateTime;

public class OscarsEvent {
    // Data fields
    private String name;
    private String venue;
    private String host;
    private int duration;
    private LocalDateTime dateTime;
    private static int eventCounter = 0;


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
        eventCounter += 1;
    }

    public OscarsEvent(){
        eventCounter += 1;
    }

    // Overridden methods

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", venue='" + venue + '\'' +
                ", host='" + host + '\'' +
                ", duration=" + duration +
                ", date and time=" + dateTime
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OscarsEvent)) return false;
        OscarsEvent obj = (OscarsEvent) o;
        return this.name.equals(obj.name);
    }
}
