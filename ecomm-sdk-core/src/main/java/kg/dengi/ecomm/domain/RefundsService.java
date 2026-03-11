package kg.dengi.ecomm.domain;

public interface RefundsService {
    RefundResponse refund(RefundRequest request);
    ReversalResponse reverse(ReversalRequest request);
}
