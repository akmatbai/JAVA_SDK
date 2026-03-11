package kg.dengi.ecomm.transport;

import kg.dengi.ecomm.config.MerchantProfile;

import java.net.URI;

public final class TransportRequest { public final URI uri; public final String body; public final MerchantProfile profile; public TransportRequest(URI uri, String body, MerchantProfile profile){this.uri=uri;this.body=body;this.profile=profile;} }
