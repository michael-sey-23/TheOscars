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
        return "Presenter{" +
                "name='" + name + '\'' +
                ", category='" + categoryPresenting + '\'' +
                ", co-presenter='" + coPresenter + '\'' +
                ", scheduled time=" + scheduledTime +
                ", has rehearsed=" + hasRehearsed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Presenter presenter)) return false;
        return hasRehearsed == presenter.hasRehearsed && Objects.equals(name, presenter.name) && Objects.equals(categoryPresenting, presenter.categoryPresenting) && Objects.equals(coPresenter, presenter.coPresenter) && Objects.equals(scheduledTime, presenter.scheduledTime);
    }
}