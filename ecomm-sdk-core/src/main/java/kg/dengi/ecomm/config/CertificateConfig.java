package kg.dengi.ecomm.config;

import kg.dengi.ecomm.exception.ConfigurationException;

import javax.net.ssl.SSLContext;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.security.KeyStore;

public final class CertificateConfig {
    public final KeyStore keyStore;
    public final SSLContext sslContext;
    private CertificateConfig(KeyStore keyStore, SSLContext sslContext){this.keyStore=keyStore;this.sslContext=sslContext;}
    public static CertificateConfig fromKeyStore(KeyStore keyStore){ return new CertificateConfig(keyStore, null); }
    public static CertificateConfig fromSslContext(SSLContext sslContext){ return new CertificateConfig(null, sslContext); }
    public static CertificateConfig fromP12(Path path, char[] password){ try(InputStream in = new FileInputStream(path.toFile())){ return fromP12(in, password);} catch (Exception e){ throw new ConfigurationException("cert", e);} }
    public static CertificateConfig fromP12(byte[] content, char[] password){ try(InputStream in = new ByteArrayInputStream(content)){ return fromP12(in, password);} catch (Exception e){ throw new ConfigurationException("cert", e);} }
    public static CertificateConfig fromP12(InputStream in, char[] password){ try{ KeyStore ks = KeyStore.getInstance("PKCS12"); ks.load(in, password); return fromKeyStore(ks);} catch (Exception e){ throw new ConfigurationException("cert", e);} }
}
