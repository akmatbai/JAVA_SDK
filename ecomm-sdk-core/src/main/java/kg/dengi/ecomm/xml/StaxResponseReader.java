package kg.dengi.ecomm.xml;

import kg.dengi.ecomm.exception.ProtocolException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public final class StaxResponseReader {
    public Map<String, String> parseResultInputs(String xml) {
        try {
            XMLStreamReader xr = XMLInputFactory.newFactory().createXMLStreamReader(new StringReader(xml));
            Map<String, String> out = new HashMap<>();
            while (xr.hasNext()) {
                if (xr.next() == XMLStreamConstants.START_ELEMENT && "input".equals(xr.getLocalName())) {
                    out.put(xr.getAttributeValue(null, "key"), xr.getAttributeValue(null, "value"));
                }
            }
            return out;
        } catch (Exception e) {
            throw new ProtocolException("invalid xml", e);
        }
    }
}
