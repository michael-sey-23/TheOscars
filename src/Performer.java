import java.time.LocalTime;

public class Performer implements Participant, Registerable, Schedulable {
    // Data fields
    private String name;
    private String performanceType;
    private String songTitle;
    private int durationMinutes;
    private LocalTime scheduledTime;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    public static int performerCounter = 0;

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

    @Override
    public void setScheduledTime(LocalTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    // Getters
    @Override
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

    @Override
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
        performerCounter += 1;
    }

    public Performer(){
        performerCounter += 1;
    }

    // Overridden methods
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", performance type='" + performanceType + '\'' +
                ", song title='" + songTitle + '\'' +
                ", duration in minutes=" + durationMinutes +
                ", scheduled time=" + scheduledTime
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Performer)) return false;
        Performer obj = (Performer) o;
        return this.name.equals(obj.name) && this.songTitle.equals(obj.songTitle);
    }

    // Interface methods
    @Override
    public String getRole() {
        return "Performer";
    }

    @Override
    public void displayInfo(){
        System.out.println("Performer info: " + this.toString());
    }

    // Registerable Interface methods
    @Override
    public boolean checkInParticipant() {
        if (checkInTime != null) {
            return false; // Already checked in
        }
        checkInTime = LocalTime.now(); // Set current time as check-in time
        return true; // Successfully checked in
    }

    @Override
    public boolean checkoutParticipant() {
        if (checkInTime == null) {
            return false; // Can't check out if not checked in
        }
        if (checkOutTime != null) {
            return false; // Already checked out
        }
        checkOutTime = LocalTime.now(); // Set current time as check-out time
        return true; // Successfully checked out
    }

    @Override
    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    @Override
    public void setCheckOutTime(LocalTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @Override
    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    @Override
    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }
}