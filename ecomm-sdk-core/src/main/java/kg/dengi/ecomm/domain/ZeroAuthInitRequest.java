package kg.dengi.ecomm.domain;

public final class ZeroAuthInitRequest extends BaseRequest {
    public final String orderId;
    private ZeroAuthInitRequest(Builder b) {
        super(b);
        this.orderId=b.orderId;
    }

    public static final class Builder extends BaseRequest.Builder<Builder> {
        String orderId;
        public Builder orderId(String v){this.orderId=v;return this;}
        @Override protected Builder self(){return this;}
        public ZeroAuthInitRequest build(){return new ZeroAuthInitRequest(this);}
    }
}
