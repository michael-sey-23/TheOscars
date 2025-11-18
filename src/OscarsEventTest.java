import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class OscarsEventTest {

    // Test OscarsEvent class
    @Test
    public void testOscarsEventConstructor() {
        LocalDateTime eventDate = LocalDateTime.of(2025, 3, 2, 19, 0);
        OscarsEvent oscars = new OscarsEvent("97th Academy Awards", "Dolby Theatre", "Jimmy Kimmel", 210, eventDate);

        assertEquals("97th Academy Awards", oscars.getName());
        assertEquals("Dolby Theatre", oscars.getVenue());
        assertEquals("Jimmy Kimmel", oscars.getHost());
        assertEquals(210, oscars.getDuration());
        assertEquals(eventDate, oscars.getDateTime());
    }

    @Test
    public void testOscarsEventSetters() {
        LocalDateTime eventDate = LocalDateTime.of(2025, 3, 2, 19, 0);
        OscarsEvent oscars = new OscarsEvent("97th Academy Awards", "Dolby Theatre", "Jimmy Kimmel", 210, eventDate);

        oscars.setName("98th Academy Awards");
        oscars.setVenue("Hollywood Bowl");
        oscars.setHost("John Mulaney");
        oscars.setDuration(180);
        LocalDateTime newDate = LocalDateTime.of(2026, 3, 1, 20, 0);
        oscars.setDateTime(newDate);

        assertEquals("98th Academy Awards", oscars.getName());
        assertEquals("Hollywood Bowl", oscars.getVenue());
        assertEquals("John Mulaney", oscars.getHost());
        assertEquals(180, oscars.getDuration());
        assertEquals(newDate, oscars.getDateTime());
    }

    // Test Nominee class
    @Test
    public void testNomineeConstructor() {
        Nominee nominee1 = new Nominee("Cillian Murphy", "Best Actor", "Oppenheimer", true, 2024);
        Nominee nominee2 = new Nominee("Emma Stone", "Best Actress", "Poor Things", true, 2024);

        assertEquals("Cillian Murphy", nominee1.getName());
        assertEquals("Best Actor", nominee1.getCategory());
        assertEquals("Oppenheimer", nominee1.getMovieTitle());
        assertTrue(nominee1.isWinner());
        assertEquals(2024, nominee1.getYearNominated());

        assertEquals("Emma Stone", nominee2.getName());
        assertEquals("Best Actress", nominee2.getCategory());
        assertEquals("Poor Things", nominee2.getMovieTitle());
        assertTrue(nominee2.isWinner());
        assertEquals(2024, nominee2.getYearNominated());
    }

    @Test
    public void testNomineeSetters() {
        Nominee nominee = new Nominee("Paul Giamatti", "Best Actor", "The Holdovers", false, 2024);

        nominee.setName("Bradley Cooper");
        nominee.setCategory("Best Actor");
        nominee.setMovieTitle("Maestro");
        nominee.setWinner(false);
        nominee.setYearNominated(2024);

        assertEquals("Bradley Cooper", nominee.getName());
        assertEquals("Best Actor", nominee.getCategory());
        assertEquals("Maestro", nominee.getMovieTitle());
        assertFalse(nominee.isWinner());
        assertEquals(2024, nominee.getYearNominated());
    }

    // Test Performer class
    @Test
    public void testPerformerConstructor() {
        LocalTime time1 = LocalTime.of(20, 15);
        LocalTime time2 = LocalTime.of(21, 30);

        Performer performer1 = new Performer("Billie Eilish", "Live Performance", "What Was I Made For?", 4, time1);
        Performer performer2 = new Performer("Ryan Gosling", "Musical Number", "I'm Just Ken", 5, time2);

        assertEquals("Billie Eilish", performer1.getName());
        assertEquals("Live Performance", performer1.getPerformanceType());
        assertEquals("What Was I Made For?", performer1.getSongTitle());
        assertEquals(4, performer1.getDurationMinutes());
        assertEquals(time1, performer1.getScheduledTime());

        assertEquals("Ryan Gosling", performer2.getName());
        assertEquals("Musical Number", performer2.getPerformanceType());
        assertEquals("I'm Just Ken", performer2.getSongTitle());
        assertEquals(5, performer2.getDurationMinutes());
        assertEquals(time2, performer2.getScheduledTime());
    }

    @Test
    public void testPerformerSetters() {
        LocalTime time = LocalTime.of(20, 15);
        Performer performer = new Performer("Billie Eilish", "Live Performance", "What Was I Made For?", 4, time);

        performer.setName("John Legend");
        performer.setPerformanceType("Piano Performance");
        performer.setSongTitle("All of Me");
        performer.setDurationMinutes(6);
        LocalTime newTime = LocalTime.of(22, 0);
        performer.setScheduledTime(newTime);

        assertEquals("John Legend", performer.getName());
        assertEquals("Piano Performance", performer.getPerformanceType());
        assertEquals("All of Me", performer.getSongTitle());
        assertEquals(6, performer.getDurationMinutes());
        assertEquals(newTime, performer.getScheduledTime());
    }

    // Test Presenter class
    @Test
    public void testPresenterConstructor() {
        LocalTime time1 = LocalTime.of(19, 45);
        LocalTime time2 = LocalTime.of(21, 0);

        Presenter presenter1 = new Presenter("Dwayne Johnson", "Best Visual Effects", "Emily Blunt", time1, true);
        Presenter presenter2 = new Presenter("Margot Robbie", "Best Director", "Ryan Gosling", time2, true);

        assertEquals("Dwayne Johnson", presenter1.getName());
        assertEquals("Best Visual Effects", presenter1.getCategoryPresenting());
        assertEquals("Emily Blunt", presenter1.getCoPresenter());
        assertEquals(time1, presenter1.getScheduledTime());
        assertTrue(presenter1.isHasRehearsed());

        assertEquals("Margot Robbie", presenter2.getName());
        assertEquals("Best Director", presenter2.getCategoryPresenting());
        assertEquals("Ryan Gosling", presenter2.getCoPresenter());
        assertEquals(time2, presenter2.getScheduledTime());
        assertTrue(presenter2.isHasRehearsed());
    }

    @Test
    public void testPresenterSetters() {
        LocalTime time = LocalTime.of(19, 45);
        Presenter presenter = new Presenter("Dwayne Johnson", "Best Visual Effects", "Emily Blunt", time, true);

        presenter.setName("Tom Hanks");
        presenter.setCategoryPresenting("Best Picture");
        presenter.setCoPresenter("Meryl Streep");
        LocalTime newTime = LocalTime.of(22, 30);
        presenter.setScheduledTime(newTime);
        presenter.setHasRehearsed(false);

        assertEquals("Tom Hanks", presenter.getName());
        assertEquals("Best Picture", presenter.getCategoryPresenting());
        assertEquals("Meryl Streep", presenter.getCoPresenter());
        assertEquals(newTime, presenter.getScheduledTime());
        assertFalse(presenter.isHasRehearsed());
    }

}