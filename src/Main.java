import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Oscar events
        LocalDateTime eventDate1 = LocalDateTime.of(2025, 3, 2, 19, 0);
        LocalDateTime eventDate2 = LocalDateTime.of(2024, 3, 10, 19, 0);
        LocalDateTime eventDate3 = LocalDateTime.of(2023, 3, 12, 20, 0);

        OscarsEvent oscars1 = new OscarsEvent("97th Academy Awards", "Dolby Theatre", "Jimmy Kimmel", 210, eventDate1);
        OscarsEvent oscars2 = new OscarsEvent("96th Academy Awards", "Dolby Theatre", "Ariana Grande", 195, eventDate2);
        OscarsEvent oscars3 = new OscarsEvent("95th Academy Awards", "Dolby Theatre", "Bob Sowah", 208, eventDate3);

        OscarsEvent[] oscarsEvents = new OscarsEvent[3];
        oscarsEvents[0] = oscars1;
        oscarsEvents[1] = oscars2;
        oscarsEvents[2] = oscars3;

        // Performers
        LocalTime time1 = LocalTime.of(20, 15);
        LocalTime time2 = LocalTime.of(21, 30);

        Performer performer1 = new Performer("Billie Eilish", "Live Performance", "What Was I Made For?", 4, time1);
        Performer performer2 = new Performer("Ryan Gosling", "Musical Number", "I'm Just Ken", 5, time2);

        Performer[] performers = new Performer[2];
        performers[0] = performer1;
        performers[1] = performer2;

        // Presenters
        LocalTime time3 = LocalTime.of(19, 45);
        LocalTime time4 = LocalTime.of(21, 0);

        Presenter presenter1 = new Presenter("Dwayne Johnson", "Best Visual Effects", "Emily Blunt", time3, true);
        Presenter presenter2 = new Presenter("Margot Robbie", "Best Director", "Ryan Gosling", time4, true);

        Presenter[] presenters = new Presenter[2];
        presenters[0] = presenter1;
        presenters[1] = presenter2;

        // Nominees
        Nominee nominee1 = new Nominee("Paul Giamatti", "Best Actor", "The Holdovers", false, 2024);
        Nominee nominee2 = new Nominee("Michael Johnson", "Best Supporting Lead", "Superman", true, 2025);

        Nominee[] nominees = new Nominee[2];
        nominees[0] = nominee1;
        nominees[1] = nominee2;

        // Display information using loops
        System.out.println("OSCARS EVENTS\n");
        for (int i = 0; i < oscarsEvents.length; i++) {
            System.out.println("Event " + (i + 1) + ": " + oscarsEvents[i]);
            System.out.println();
        }

        System.out.println("PERFORMERS\n");
        for (int i = 0; i < performers.length; i++) {
            System.out.println("Performer " + (i + 1) + ": " + performers[i]);
            System.out.println();
        }

        System.out.println("PRESENTERS\n");
        for (int i = 0; i < presenters.length; i++) {
            System.out.println("Presenter " + (i + 1) + ": " + presenters[i]);
            System.out.println();
        }

        System.out.println("NOMINEES\n");
        for (int i = 0; i < nominees.length; i++) {
            System.out.println("Nominee " + (i + 1) + ": " + nominees[i]);
            System.out.println();
        }
    }
}