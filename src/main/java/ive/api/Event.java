package ive.api;

import java.time.ZonedDateTime;

public class Event {
    private ZonedDateTime time;
    private String message;

    public Event() {
    }

    public Event(ZonedDateTime time, String message) {
        this.time = time;
        this.message = message;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
