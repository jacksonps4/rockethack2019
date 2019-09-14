package ive.services;

import ive.api.Event;
import ive.entity.Translation;

import java.util.List;
import java.util.stream.Collectors;

public class EventService {
    private final RecordingRepository recordingRepository;
    private final TranslationRepository translationRepository;

    public EventService(RecordingRepository recordingRepository, TranslationRepository translationRepository) {
        this.recordingRepository = recordingRepository;
        this.translationRepository = translationRepository;
    }

    public List<Event> getRecentEvents(String language) {
        List<Translation> translations = translationRepository.getAllByLanguageName(language);
        return translations.stream()
                .map(t -> new Event(t.getRecording().getEventTime(), t.getTranscript()))
                .collect(Collectors.toList());
    }
}
