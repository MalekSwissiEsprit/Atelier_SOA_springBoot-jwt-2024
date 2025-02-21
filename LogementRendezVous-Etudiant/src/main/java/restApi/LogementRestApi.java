package restApi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entities.Logement;
import metiers.LogementBusiness;
import java.util.List;

@Path("/logements")
public class LogementRestApi {

    private final LogementBusiness logB = new LogementBusiness();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllLogement() {
        List<Logement> logements = logB.getLogements();
        return Response.ok(logements).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response addLog(Logement log) {
        logB.addLogement(log);
        return Response.ok("Logement added successfully").build();
    }
}
