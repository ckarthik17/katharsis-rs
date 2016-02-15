package io.katharsis.rs.type;

import javax.ws.rs.core.MediaType;
import java.nio.charset.StandardCharsets;

public class JsonApiMediaType {
    /**
     * A {@code String} constant representing {@value #APPLICATION_JSON_API} media type.
     */
    public final static String APPLICATION_JSON_API = "application/vnd.api+json;charset=UTF-8";
    /**
     * A {@link MediaType} constant representing {@value #APPLICATION_JSON_API} media type.
     */
    public final static MediaType APPLICATION_JSON_API_TYPE = new MediaType("application", "vnd.api+json")
        .withCharset(StandardCharsets.UTF_8.displayName());
}
