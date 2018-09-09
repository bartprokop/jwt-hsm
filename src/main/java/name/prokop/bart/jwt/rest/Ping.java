package name.prokop.bart.jwt.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("ping")
public class Ping {

    @GET
    @Produces("text/plain")
    public String ping() {
        return "ping";
    }

    @Path("pong")
    @GET
    @Produces("text/plain")
    public String pong() {
        return "pong";
    }
}
