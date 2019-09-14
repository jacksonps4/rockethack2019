package ive.web;

import ive.services.EventService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("event")
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {
    @Inject
    EventService eventService;

    @GET
    public Response getEvents(@QueryParam("language") String language) {
        return Response.ok(eventService.getRecentEvents(language))
                .build();
    }
}
