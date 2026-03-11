package kg.dengi.ecomm.logging;

public final class DefaultSensitiveDataMasker implements SensitiveDataMasker { @Override public String mask(String input){ return input.replaceAll("(?i)(<attribute\s+name=\"pan\"\s+value=\")[^\"]+(\")", "$1***$2").replaceAll("(?i)(<attribute\s+name=\"cvv\"\s+value=\")[^\"]+(\")", "$1***$2").replaceAll("(?i)(token=)[^&]+", "$1***"); } }
