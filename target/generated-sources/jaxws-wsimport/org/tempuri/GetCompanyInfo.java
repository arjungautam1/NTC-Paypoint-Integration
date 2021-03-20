
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salePointType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "companyCode",
    "serviceCode",
    "userId",
    "userPassword",
    "salePointType"
})
@XmlRootElement(name = "GetCompanyInfo")
public class GetCompanyInfo {

    @XmlSchemaType(name = "unsignedShort")
    protected int companyCode;
    @XmlSchemaType(name = "unsignedShort")
    protected int serviceCode;
    protected String userId;
    protected String userPassword;
    protected int salePointType;

    /**
     * Gets the value of the companyCode property.
     * 
     */
    public int getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     */
    public void setCompanyCode(int value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     */
    public int getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     */
    public void setServiceCode(int value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets the value of the userPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Gets the value of the salePointType property.
     * 
     */
    public int getSalePointType() {
        return salePointType;
    }

    /**
     * Sets the value of the salePointType property.
     * 
     */
    public void setSalePointType(int value) {
        this.salePointType = value;
    }

}