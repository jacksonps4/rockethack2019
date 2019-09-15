package ive.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class IveEndpoint extends ResourceConfig {
    public IveEndpoint() {
        register(AudioCaptureResource.class);
        register(EventResource.class);
        register(CorsProvider.class);
    }
}
