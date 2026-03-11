package kg.dengi.ecomm.exception;

public class EcommException extends RuntimeException {
    public EcommException(String m){super(m);}
    public EcommException(String m, Throwable c){super(m, c);}
}
