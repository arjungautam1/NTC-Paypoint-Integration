
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DailyReconciliationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dailyReconciliationResult"
})
@XmlRootElement(name = "DailyReconciliationResponse")
public class DailyReconciliationResponse {

    @XmlElement(name = "DailyReconciliationResult")
    protected String dailyReconciliationResult;

    /**
     * Gets the value of the dailyReconciliationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyReconciliationResult() {
        return dailyReconciliationResult;
    }

    /**
     * Sets the value of the dailyReconciliationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyReconciliationResult(String value) {
        this.dailyReconciliationResult = value;
    }

}
