package ive.config;

import ive.services.EventService;
import ive.services.RecordingRepository;
import ive.services.TranslationRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IveConfiguration {
    @Bean
    public EventService eventService(RecordingRepository recordingRepository, TranslationRepository translationRepository) {
        return new EventService(recordingRepository, translationRepository);
    }
}
