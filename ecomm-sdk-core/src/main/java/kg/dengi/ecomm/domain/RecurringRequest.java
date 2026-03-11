package kg.dengi.ecomm.domain;

public final class RecurringRequest extends BaseRequest {
    public final String token;
    private RecurringRequest(Builder b) {
        super(b);
        this.token=b.token;
    }

    public static final class Builder extends BaseRequest.Builder<Builder> {
        String token;
        public Builder token(String v){this.token=v;return this;}
        @Override protected Builder self(){return this;}
        public RecurringRequest build(){return new RecurringRequest(this);}
    }
}
