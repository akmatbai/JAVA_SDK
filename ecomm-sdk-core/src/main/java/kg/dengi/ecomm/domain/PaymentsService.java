package kg.dengi.ecomm.domain;

public interface PaymentsService {
    PaymentPageInitResponse initPaymentPage(PaymentPageInitRequest request);
    H2HPaymentResponse createH2HPayment(H2HPaymentRequest request);
    ZeroAuthInitResponse initZeroAuthorization(ZeroAuthInitRequest request);
    TokenPaymentResponse payWithToken(TokenPaymentRequest request);
}
