package sampleApp;


import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/v1/resource")
@Produces(MediaType.APPLICATION_JSON)
public class AppResource {
    private final String firstParameter;
    private final String secondParameter;
    private final String message;

    public AppResource(String message, String firstParameter, String secondParameter)
    {
        this.message = message;
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    @GET
    @Timed
    public AppRepresentation getMessage(@QueryParam("first") Optional<String> first, @QueryParam("second") Optional<String> second) {
        final String value = String.format(message, first.orElse(firstParameter), second.orElse(secondParameter));
        return new AppRepresentation(value);
    }

}
