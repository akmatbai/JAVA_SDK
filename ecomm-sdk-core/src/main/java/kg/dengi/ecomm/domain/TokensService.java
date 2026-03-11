package kg.dengi.ecomm.domain;

public interface TokensService {
    TokenAcquireResponse acquireToken(TokenAcquireRequest request);
}
