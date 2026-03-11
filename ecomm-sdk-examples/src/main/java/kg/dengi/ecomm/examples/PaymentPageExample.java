package kg.dengi.ecomm.examples;

import kg.dengi.ecomm.api.EcommClient;
import kg.dengi.ecomm.config.EcommClientConfig;
import kg.dengi.ecomm.domain.PaymentPageInitRequest;

public class PaymentPageExample {
    public static void main(String[] args) {
        EcommClient client = EcommClient.create(new EcommClientConfig(java.util.Collections.emptyMap()));
        client.payments.initPaymentPage(new PaymentPageInitRequest.Builder().merchantProfile("default").orderId("016200").amount(556).currency("417").build());
    }
}
