package name.prokop.bart.jwt.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Bart Prokop
 */
@ApplicationPath("/")
public class RESTEasyApplication extends Application {

    private final HashSet<Object> singletons = new HashSet<>();

    public RESTEasyApplication() {
        singletons.add(new Ping());
    }
    
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
