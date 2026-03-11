package kg.dengi.ecomm.domain;

public final class RawExecutionResponse {
    public final String maskedRequest;
    public final String maskedResponse;
    public RawExecutionResponse(String maskedRequest, String maskedResponse){ this.maskedRequest=maskedRequest; this.maskedResponse=maskedResponse; }
}
