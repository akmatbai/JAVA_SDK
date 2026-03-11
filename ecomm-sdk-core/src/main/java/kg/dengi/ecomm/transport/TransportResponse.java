package kg.dengi.ecomm.transport;

import java.util.List;
import java.util.Map;

public final class TransportResponse { public final int status; public final String body; public final Map<String, List<String>> headers; public TransportResponse(int status, String body, Map<String, List<String>> headers){this.status=status;this.body=body;this.headers=headers;} }
