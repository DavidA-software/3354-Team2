import org.junit.Test;
import main.java.service.ReservationService;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class ReservationServiceTest {
    ReservationService reservationService = new ReservationService();

    @Test
    public void reservationServiceTestValid() {
        LocalDateTime startTime = LocalDateTime.of(2026, 7, 22, 9, 30);
        LocalDateTime endTime = LocalDateTime.of(2026, 7, 22, 14, 30);

        assertTrue("Here is reservation test case 1", reservationService.isValidDuration(startTime, endTime));
    }

    @Test
    public void reservationServiceTestInvalid() {
        LocalDateTime startTime = LocalDateTime.of(2026, 7, 22, 9, 30);
        LocalDateTime endTime = LocalDateTime.of(2026, 7, 22, 14, 31);

        assertTrue("Here is reservation test case 2", reservationService.isValidDuration(startTime, endTime));
    }


}