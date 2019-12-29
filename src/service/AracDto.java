
package src.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aracDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aracDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aracMarka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aracModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="koltukSayisi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aracDto", propOrder = {
    "aracMarka",
    "aracModel",
    "id",
    "koltukSayisi"
})
public class AracDto {

    protected String aracMarka;
    protected String aracModel;
    protected Long id;
    protected int koltukSayisi;

    /**
     * Gets the value of the aracMarka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAracMarka() {
        return aracMarka;
    }

    /**
     * Sets the value of the aracMarka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAracMarka(String value) {
        this.aracMarka = value;
    }

    /**
     * Gets the value of the aracModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAracModel() {
        return aracModel;
    }

    /**
     * Sets the value of the aracModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAracModel(String value) {
        this.aracModel = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the koltukSayisi property.
     * 
     */
    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    /**
     * Sets the value of the koltukSayisi property.
     * 
     */
    public void setKoltukSayisi(int value) {
        this.koltukSayisi = value;
    }

}
