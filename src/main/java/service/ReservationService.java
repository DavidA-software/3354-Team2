package main.java.service;

import java.time.LocalDateTime;
import java.time.Duration;

public class ReservationService {
    public boolean isValidDuration(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long minutes = duration.toMinutes();

        // If the duration is over 5 hours or 300 minutes, valid reservation
        if(minutes <= 300){
            return true;
        }

        return false;
    }
}