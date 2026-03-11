package kg.dengi.ecomm.callback;

import kg.dengi.ecomm.domain.UnifiedStatus;

import java.util.Map;

public final class VerifiedCallbackEvent { public final String id; public final String authKey; public final UnifiedStatus status; public final Map<String,String> raw; public VerifiedCallbackEvent(String id, String authKey, UnifiedStatus status, Map<String,String> raw){this.id=id;this.authKey=authKey;this.status=status;this.raw=raw;} }
