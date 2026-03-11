package kg.dengi.ecomm.api;

import kg.dengi.ecomm.config.EcommClientConfig;
import kg.dengi.ecomm.config.EcommValidator;
import kg.dengi.ecomm.domain.*;
import kg.dengi.ecomm.internal.DefaultFacade;

public final class EcommClient {
    public final PaymentsService payments;
    public final StatusService status;
    public final RefundsService refunds;
    public final TokensService tokens;
    public final RecurringService recurring;
    public final AdvancedExecutionService advanced;

    private EcommClient(DefaultFacade facade) {
        this.payments = facade;
        this.status = facade;
        this.refunds = facade;
        this.tokens = facade;
        this.recurring = facade;
        this.advanced = facade;
    }

    public static EcommClient create(EcommClientConfig config) {
        EcommValidator.validate(config);
        return new EcommClient(new DefaultFacade(config));
    }
}
