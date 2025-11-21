import java.time.LocalTime;

public interface Registerable {
    boolean checkInParticipant();
    boolean checkoutParticipant();
    void setCheckInTime(LocalTime checkInTime);
    void setCheckOutTime(LocalTime checkOutTime);
    LocalTime getCheckInTime();
    LocalTime getCheckOutTime();
}