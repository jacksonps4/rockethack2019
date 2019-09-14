package ive.entity;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "recordings")
public class Recording {
    @Id
    private long id;
    private ZonedDateTime eventTime;
    private byte[] recording;
    private String mlTranscript;
    @OneToMany
    private List<Tag> tags;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ZonedDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(ZonedDateTime eventTime) {
        this.eventTime = eventTime;
    }

    public byte[] getRecording() {
        return recording;
    }

    public void setRecording(byte[] recording) {
        this.recording = recording;
    }

    public String getMlTranscript() {
        return mlTranscript;
    }

    public void setMlTranscript(String mlTranscript) {
        this.mlTranscript = mlTranscript;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
