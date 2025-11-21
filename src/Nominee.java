import java.time.LocalTime;

public class Nominee implements Participant, Registerable{
    // Data fields
    private String name;
    private String category;
    private String movieTitle;
    private boolean isWinner;
    private int yearNominated;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    public static int nomineeCounter = 0;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public void setYearNominated(int yearNominated) {
        this.yearNominated = yearNominated;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public int getYearNominated() {
        return yearNominated;
    }

    // Constructor
    public Nominee(String name, String category, String movieTitle, boolean isWinner, int yearNominated) {
        setName(name);
        setCategory(category);
        setMovieTitle(movieTitle);
        setWinner(isWinner);
        setYearNominated(yearNominated);
        nomineeCounter += 1;
    }

    public Nominee(){
        nomineeCounter += 1;
    }

    // Overridden methods
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", movie title='" + movieTitle + '\'' +
                ", is winner=" + isWinner +
                ", year nominated=" + yearNominated
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nominee)) return false;
        Nominee obj = (Nominee) o;
        return this.name.equals(obj.name) && this.category.equals(obj.category);
    }

    // Participant Interface methods
    @Override
    public String getRole() {
        return "Nominee";
    }

    @Override
    public void displayInfo(){
        System.out.println("Nominee info: " + this.toString());
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