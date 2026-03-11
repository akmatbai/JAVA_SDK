package kg.dengi.ecomm.logging;

public final class MaskedPayloadSnapshot { public final String operation; public final String maskedRequestXml; public final String maskedResponseXml; public MaskedPayloadSnapshot(String operation, String maskedRequestXml, String maskedResponseXml){this.operation=operation;this.maskedRequestXml=maskedRequestXml;this.maskedResponseXml=maskedResponseXml;} }
