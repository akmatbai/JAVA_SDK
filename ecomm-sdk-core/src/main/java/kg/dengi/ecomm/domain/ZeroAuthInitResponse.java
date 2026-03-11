package kg.dengi.ecomm.domain;

public final class ZeroAuthInitResponse {
    public final String authKey;
    public final String url;
    public final BankRaw raw;
    public ZeroAuthInitResponse(String authKey, String url, BankRaw raw){ this.authKey=authKey; this.url=url; this.raw=raw; }
}
