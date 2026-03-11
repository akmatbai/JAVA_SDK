package kg.dengi.ecomm.domain;

public final class PaymentPageInitRequest extends BaseRequest {
    public final String orderId;
    public final long amount;
    public final String currency;
    private PaymentPageInitRequest(Builder b) {
        super(b);
        this.orderId=b.orderId; this.amount=b.amount; this.currency=b.currency;
    }

    public static final class Builder extends BaseRequest.Builder<Builder> {
        String orderId; long amount; String currency;
        public Builder orderId(String v){this.orderId=v;return this;}
        public Builder amount(long v){this.amount=v;return this;}
        public Builder currency(String v){this.currency=v;return this;}
        @Override protected Builder self(){return this;}
        public PaymentPageInitRequest build(){return new PaymentPageInitRequest(this);}
    }
}
