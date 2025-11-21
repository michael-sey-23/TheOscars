import java.time.LocalTime;

public class Presenter implements Participant, Registerable, Schedulable {
    // Data fields
    private String name;
    private String categoryPresenting;
    private String coPresenter;
    private LocalTime scheduledTime;
    private boolean hasRehearsed;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private static int presenterCounter = 0;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryPresenting(String categoryPresenting) {
        this.categoryPresenting = categoryPresenting;
    }

    public void setCoPresenter(String coPresenter) {
        this.coPresenter = coPresenter;
    }

    @Override
    public void setScheduledTime(LocalTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public void setHasRehearsed(boolean hasRehearsed) {
        this.hasRehearsed = hasRehearsed;
    }

    // Getters
    @Override
    public String getName() {
        return name;
    }

    public String getCategoryPresenting() {
        return categoryPresenting;
    }

    public String getCoPresenter() {
        return coPresenter;
    }

    @Override
    public LocalTime getScheduledTime() {
        return scheduledTime;
    }

    public boolean isHasRehearsed() {
        return hasRehearsed;
    }

    // Constructor
    public Presenter(String name, String categoryPresenting, String coPresenter, LocalTime scheduledTime, boolean hasRehearsed) {
        setName(name);
        setCategoryPresenting(categoryPresenting);
        setCoPresenter(coPresenter);
        setScheduledTime(scheduledTime);
        setHasRehearsed(hasRehearsed);
        presenterCounter += 1;
    }

    public Presenter(){
        presenterCounter += 1;
    }

    // Overridden methods
    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", category='" + categoryPresenting + '\'' +
                ", co-presenter='" + coPresenter + '\'' +
                ", scheduled time=" + scheduledTime +
                ", has rehearsed=" + hasRehearsed
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Presenter)) return false;
        Presenter obj = (Presenter) o;
        return this.name.equals(obj.name) && this.categoryPresenting.equals(obj.categoryPresenting);
    }

    // Participant Interface methods
    @Override
    public String getRole() {
        return "Presenter";
    }

    @Override
    public void displayInfo(){
        System.out.println("Presenter info: " + this.toString());
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