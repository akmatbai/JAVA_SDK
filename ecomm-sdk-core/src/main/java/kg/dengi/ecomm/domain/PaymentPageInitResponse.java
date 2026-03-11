package kg.dengi.ecomm.domain;

public final class PaymentPageInitResponse {
    public final String authKey;
    public final String url;
    public final BankRaw raw;
    public PaymentPageInitResponse(String authKey, String url, BankRaw raw){ this.authKey=authKey; this.url=url; this.raw=raw; }
}
