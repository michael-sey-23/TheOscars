import java.time.LocalTime;
import java.util.Objects;

public class Presenter {
    // Data fields
    private String name;
    private String categoryPresenting;
    private String coPresenter;
    private LocalTime scheduledTime;
    private boolean hasRehearsed;

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

    public void setScheduledTime(LocalTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public void setHasRehearsed(boolean hasRehearsed) {
        this.hasRehearsed = hasRehearsed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategoryPresenting() {
        return categoryPresenting;
    }

    public String getCoPresenter() {
        return coPresenter;
    }

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
}