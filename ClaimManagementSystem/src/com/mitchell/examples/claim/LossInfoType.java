//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.13 at 01:06:53 PM IST 
//


package com.mitchell.examples.claim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LossInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LossInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CauseOfLoss" type="{http://www.mitchell.com/examples/claim}CauseOfLossCode" minOccurs="0"/>
 *         &lt;element name="ReportedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LossDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LossInfoType", propOrder = {
    "causeOfLoss",
    "reportedDate",
    "lossDescription"
})
public class LossInfoType {

    @XmlElement(name = "CauseOfLoss")
    protected CauseOfLossCode causeOfLoss;
    @XmlElement(name = "ReportedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportedDate;
    @XmlElement(name = "LossDescription")
    protected String lossDescription;

    /**
     * Gets the value of the causeOfLoss property.
     * 
     * @return
     *     possible object is
     *     {@link CauseOfLossCode }
     *     
     */
    public CauseOfLossCode getCauseOfLoss() {
        return causeOfLoss;
    }

    /**
     * Sets the value of the causeOfLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseOfLossCode }
     *     
     */
    public void setCauseOfLoss(CauseOfLossCode value) {
        this.causeOfLoss = value;
    }

    /**
     * Gets the value of the reportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportedDate() {
        return reportedDate;
    }

    /**
     * Sets the value of the reportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportedDate(XMLGregorianCalendar value) {
        this.reportedDate = value;
    }

    /**
     * Gets the value of the lossDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossDescription() {
        return lossDescription;
    }

    /**
     * Sets the value of the lossDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossDescription(String value) {
        this.lossDescription = value;
    }

}
