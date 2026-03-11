package kg.dengi.ecomm.xml;

import kg.dengi.ecomm.exception.SerializationException;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.StringWriter;
import java.util.Map;

public final class StaxRequestWriter {
    public String paymentPage(String point, String serviceId, Map<String, String> attrs) {
        try {
            StringWriter writer = new StringWriter();
            XMLStreamWriter xw = XMLOutputFactory.newFactory().createXMLStreamWriter(writer);
            xw.writeStartDocument("UTF-8", "1.0");
            xw.writeStartElement("request");
            xw.writeAttribute("point", point);
            xw.writeStartElement("advanced");
            xw.writeAttribute("service", serviceId);
            xw.writeAttribute("function", "auth-acquiring");
            for (Map.Entry<String, String> entry : attrs.entrySet()) {
                xw.writeEmptyElement("attribute");
                xw.writeAttribute("name", entry.getKey());
                xw.writeAttribute("value", entry.getValue());
            }
            xw.writeEndElement();
            xw.writeEndElement();
            xw.writeEndDocument();
            xw.close();
            return writer.toString();
        } catch (Exception e) {
            throw new SerializationException("write xml", e);
        }
    }
}
