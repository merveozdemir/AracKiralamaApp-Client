
package src.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the src.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindAllArac_QNAME = new QName("http://soap.service.vaadin.com/", "findAllArac");
    private final static QName _FindAllAracResponse_QNAME = new QName("http://soap.service.vaadin.com/", "findAllAracResponse");
    private final static QName _SaveArac_QNAME = new QName("http://soap.service.vaadin.com/", "saveArac");
    private final static QName _SaveAracResponse_QNAME = new QName("http://soap.service.vaadin.com/", "saveAracResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: src.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllArac }
     * 
     */
    public FindAllArac createFindAllArac() {
        return new FindAllArac();
    }

    /**
     * Create an instance of {@link FindAllAracResponse }
     * 
     */
    public FindAllAracResponse createFindAllAracResponse() {
        return new FindAllAracResponse();
    }

    /**
     * Create an instance of {@link SaveArac }
     * 
     */
    public SaveArac createSaveArac() {
        return new SaveArac();
    }

    /**
     * Create an instance of {@link SaveAracResponse }
     * 
     */
    public SaveAracResponse createSaveAracResponse() {
        return new SaveAracResponse();
    }

    /**
     * Create an instance of {@link AracDto }
     * 
     */
    public AracDto createAracDto() {
        return new AracDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllArac }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllArac }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.service.vaadin.com/", name = "findAllArac")
    public JAXBElement<FindAllArac> createFindAllArac(FindAllArac value) {
        return new JAXBElement<FindAllArac>(_FindAllArac_QNAME, FindAllArac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAracResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllAracResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.service.vaadin.com/", name = "findAllAracResponse")
    public JAXBElement<FindAllAracResponse> createFindAllAracResponse(FindAllAracResponse value) {
        return new JAXBElement<FindAllAracResponse>(_FindAllAracResponse_QNAME, FindAllAracResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveArac }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveArac }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.service.vaadin.com/", name = "saveArac")
    public JAXBElement<SaveArac> createSaveArac(SaveArac value) {
        return new JAXBElement<SaveArac>(_SaveArac_QNAME, SaveArac.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveAracResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveAracResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.service.vaadin.com/", name = "saveAracResponse")
    public JAXBElement<SaveAracResponse> createSaveAracResponse(SaveAracResponse value) {
        return new JAXBElement<SaveAracResponse>(_SaveAracResponse_QNAME, SaveAracResponse.class, null, value);
    }

}
