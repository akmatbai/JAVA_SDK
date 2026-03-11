package kg.dengi.ecomm.domain;

public final class TokenPaymentRequest extends BaseRequest {
    public final String token;
    private TokenPaymentRequest(Builder b) {
        super(b);
        this.token=b.token;
    }

    public static final class Builder extends BaseRequest.Builder<Builder> {
        String token;
        public Builder token(String v){this.token=v;return this;}
        @Override protected Builder self(){return this;}
        public TokenPaymentRequest build(){return new TokenPaymentRequest(this);}
    }
}
