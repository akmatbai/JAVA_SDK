package kg.dengi.ecomm.domain;

public interface StatusService {
    PaymentStatusResponse getPaymentLinkStatus(String authKey);
    OperationStatusResponse getOperationStatus(String id);
}
