package kg.dengi.ecomm.internal;

import kg.dengi.ecomm.config.EcommClientConfig;
import kg.dengi.ecomm.domain.*;

public final class DefaultFacade implements PaymentsService, StatusService, RefundsService, TokensService, RecurringService, AdvancedExecutionService {
    private final EcommClientConfig config;
    public DefaultFacade(EcommClientConfig config){this.config=config;}

    public PaymentPageInitResponse initPaymentPage(PaymentPageInitRequest request){ return new PaymentPageInitResponse("TODO-authKey","TODO-url",new BankRaw("0","OK","",java.util.Collections.emptyMap())); }
    public H2HPaymentResponse createH2HPayment(H2HPaymentRequest request){ return new H2HPaymentResponse("TODO-id",new BankRaw("0","OK","",java.util.Collections.emptyMap())); }
    public ZeroAuthInitResponse initZeroAuthorization(ZeroAuthInitRequest request){ return new ZeroAuthInitResponse("TODO-authKey","TODO-url",new BankRaw("0","OK","",java.util.Collections.emptyMap())); }
    public TokenPaymentResponse payWithToken(TokenPaymentRequest request){ return new TokenPaymentResponse("TODO-id",new BankRaw("0","OK","",java.util.Collections.emptyMap())); }
    public PaymentStatusResponse getPaymentLinkStatus(String authKey){ return new PaymentStatusResponse(UnifiedStatus.PENDING,new BankRaw("","","",java.util.Collections.emptyMap())); }
    public OperationStatusResponse getOperationStatus(String id){ return new OperationStatusResponse(UnifiedStatus.PENDING,new BankRaw("","","",java.util.Collections.emptyMap())); }
    public RefundResponse refund(RefundRequest request){ return new RefundResponse("TODO-refund",new BankRaw("","","",java.util.Collections.emptyMap())); }
    public ReversalResponse reverse(ReversalRequest request){ return new ReversalResponse("TODO-reversal",new BankRaw("","","",java.util.Collections.emptyMap())); }
    public TokenAcquireResponse acquireToken(TokenAcquireRequest request){ return new TokenAcquireResponse("TODO-token",new BankRaw("","","",java.util.Collections.emptyMap())); }
    public RecurringResponse createRecurring(RecurringRequest request){ return new RecurringResponse("TODO-recurring",new BankRaw("","","",java.util.Collections.emptyMap())); }
    public RawExecutionResponse executeRaw(RawExecutionRequest request){ return new RawExecutionResponse("",""); }
    public HealthCheckResult preflight(){ return new HealthCheckResult(true,"NO_NETWORK_PROBE"); }
}
