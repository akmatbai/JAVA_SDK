package kg.dengi.ecomm.transport;

import kg.dengi.ecomm.exception.TransportException;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public final class JdkHttpTransport implements HttpTransport {
    private final HttpClient client;
    public JdkHttpTransport(HttpClient client){this.client=client;}

    @Override
    public TransportResponse execute(TransportRequest request) {
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder(request.uri)
                    .header("Content-Type", "application/xml; charset=UTF-8")
                    .header("Accept", "application/xml, text/xml, */*")
                    .POST(HttpRequest.BodyPublishers.ofString(request.body, StandardCharsets.UTF_8))
                    .build();
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return new TransportResponse(response.statusCode(), response.body(), response.headers().map());
        } catch (Exception e) {
            throw new TransportException("transport failed", e);
        }
    }
}
