package kg.dengi.ecomm.domain;

public final class H2HPaymentRequest extends BaseRequest {
    public final String orderId;
    public final String pan;
    public final String cvv;
    public final String expiry;
    private H2HPaymentRequest(Builder b) {
        super(b);
        this.orderId=b.orderId; this.pan=b.pan; this.cvv=b.cvv; this.expiry=b.expiry;
    }

    public static final class Builder extends BaseRequest.Builder<Builder> {
        String orderId; String pan; String cvv; String expiry;
        public Builder orderId(String v){this.orderId=v;return this;}
        public Builder pan(String v){this.pan=v;return this;}
        public Builder cvv(String v){this.cvv=v;return this;}
        public Builder expiry(String v){this.expiry=v;return this;}
        @Override protected Builder self(){return this;}
        public H2HPaymentRequest build(){return new H2HPaymentRequest(this);}
    }
}
