package kg.dengi.ecomm.domain;

public final class ReversalRequest extends BaseRequest {
    public final String id;
    private ReversalRequest(Builder b) {
        super(b);
        this.id=b.id;
    }

    public static final class Builder extends BaseRequest.Builder<Builder> {
        String id;
        public Builder id(String v){this.id=v;return this;}
        @Override protected Builder self(){return this;}
        public ReversalRequest build(){return new ReversalRequest(this);}
    }
}
