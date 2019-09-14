package ive.entity;

import javax.persistence.*;

@Entity
@Table(name = "translations")
public class Translation {
    @Id
    private long id;
    @ManyToOne
    private Recording recording;
    private String languageName;
    private String transcript;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Recording getRecording() {
        return recording;
    }

    public void setRecording(Recording recording) {
        this.recording = recording;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }
}
