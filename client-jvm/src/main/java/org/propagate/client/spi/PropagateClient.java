package org.propagate.client.spi;

import org.propagate.client.provider.websocket.Jdk11BasedWebsocketClientImpl;

import java.net.URI;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public interface PropagateClient extends Runnable {
    String eval(String key, Map<String, Object> ctx, Supplier<String> fallback);

    @Deprecated
    static LegacyPollingBasedPropagateClientBuilder newBuilder(String env) {
        return new LegacyPollingBasedPropagateClientBuilder(Objects.requireNonNull(env));
    }

    /**
     * Returns a <b>Websocket</b> backed Propagate client instance.
     * Todo: revisit this definition
     *
     * @param env deployment environment, like staging, production
     * @param uri Propagate server URL
     * @return a newly built {@code PropagateClient} instance
     */
    static PropagateClient newPropagateClient(String env, String uri) {
        return new Jdk11BasedWebsocketClientImpl(env, URI.create(uri));
    }
}