package kg.dengi.ecomm.domain;

public abstract class BaseRequest {
    public final String merchantProfile;
    public final String idempotencyKey;

    protected BaseRequest(Builder<?> b) {
        this.merchantProfile = b.merchantProfile;
        this.idempotencyKey = b.idempotencyKey;
    }

    public abstract static class Builder<T extends Builder<T>> {
        String merchantProfile;
        String idempotencyKey;
        public T merchantProfile(String v){ this.merchantProfile = v; return self(); }
        public T idempotencyKey(String v){ this.idempotencyKey = v; return self(); }
        protected abstract T self();
    }
}
