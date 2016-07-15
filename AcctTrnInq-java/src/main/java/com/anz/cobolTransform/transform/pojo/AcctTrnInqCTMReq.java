//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.29 at 02:32:19 PM IST 
//


package com.anz.cobolTransform.transform.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnInqCTMReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnInqCTMReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceRequest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InputHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceRequest2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="24"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VersionNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__short">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EffectiveDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="99999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InitiatedDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="99999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InitiatedTime">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="99999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="InitiatingCo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="99999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Operator">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OperatorBranch">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="WorkstationId">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OriginatingApplication">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SecondaryHeader">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProcessingApplication">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AccountNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="23"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RegistrationNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
 *                         &lt;maxLength value="23"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LinkageNumber">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__short">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceRequestMsg">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NoToRetrieve">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__short">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NextTransactionStart">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TransactionProcessDate">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="99999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnInqCTMReq", propOrder = {
    "serviceRequest",
    "inputHeader",
    "secondaryHeader",
    "serviceRequestMsg"
})
public class AcctTrnInqCTMReq {

    @XmlElement(name = "ServiceRequest", required = true, defaultValue = " ")
    protected String serviceRequest;
    @XmlElement(name = "InputHeader", required = true)
    protected AcctTrnInqCTMReq.InputHeader inputHeader;
    @XmlElement(name = "SecondaryHeader", required = true)
    protected AcctTrnInqCTMReq.SecondaryHeader secondaryHeader;
    @XmlElement(name = "ServiceRequestMsg", required = true)
    protected AcctTrnInqCTMReq.ServiceRequestMsg serviceRequestMsg;

    /**
     * Gets the value of the serviceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Sets the value of the serviceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequest(String value) {
        this.serviceRequest = value;
    }

    /**
     * Gets the value of the inputHeader property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnInqCTMReq.InputHeader }
     *     
     */
    public AcctTrnInqCTMReq.InputHeader getInputHeader() {
        return inputHeader;
    }

    /**
     * Sets the value of the inputHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnInqCTMReq.InputHeader }
     *     
     */
    public void setInputHeader(AcctTrnInqCTMReq.InputHeader value) {
        this.inputHeader = value;
    }

    /**
     * Gets the value of the secondaryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnInqCTMReq.SecondaryHeader }
     *     
     */
    public AcctTrnInqCTMReq.SecondaryHeader getSecondaryHeader() {
        return secondaryHeader;
    }

    /**
     * Sets the value of the secondaryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnInqCTMReq.SecondaryHeader }
     *     
     */
    public void setSecondaryHeader(AcctTrnInqCTMReq.SecondaryHeader value) {
        this.secondaryHeader = value;
    }

    /**
     * Gets the value of the serviceRequestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnInqCTMReq.ServiceRequestMsg }
     *     
     */
    public AcctTrnInqCTMReq.ServiceRequestMsg getServiceRequestMsg() {
        return serviceRequestMsg;
    }

    /**
     * Sets the value of the serviceRequestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnInqCTMReq.ServiceRequestMsg }
     *     
     */
    public void setServiceRequestMsg(AcctTrnInqCTMReq.ServiceRequestMsg value) {
        this.serviceRequestMsg = value;
    }


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
     *         &lt;element name="ServiceRequest2">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="24"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VersionNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__short">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="99"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EffectiveDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="99999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InitiatedDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="99999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InitiatedTime">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="99999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="InitiatingCo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="99999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Operator">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OperatorBranch">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="WorkstationId">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OriginatingApplication">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "serviceRequest2",
        "versionNumber",
        "effectiveDate",
        "initiatedDate",
        "initiatedTime",
        "initiatingCo",
        "operator",
        "operatorBranch",
        "workstationId",
        "originatingApplication"
    })
    public static class InputHeader {

        @XmlElement(name = "ServiceRequest2", required = true, defaultValue = " ")
        protected String serviceRequest2;
        @XmlElement(name = "VersionNumber", defaultValue = "0")
        protected int versionNumber;
        @XmlElement(name = "EffectiveDate", defaultValue = "0")
        protected long effectiveDate;
        @XmlElement(name = "InitiatedDate", defaultValue = "0")
        protected long initiatedDate;
        @XmlElement(name = "InitiatedTime", defaultValue = "0")
        protected long initiatedTime;
        @XmlElement(name = "InitiatingCo", defaultValue = "0")
        protected long initiatingCo;
        @XmlElement(name = "Operator", required = true, defaultValue = " ")
        protected String operator;
        @XmlElement(name = "OperatorBranch", defaultValue = "0")
        protected long operatorBranch;
        @XmlElement(name = "WorkstationId", required = true, defaultValue = " ")
        protected String workstationId;
        @XmlElement(name = "OriginatingApplication", required = true, defaultValue = " ")
        protected String originatingApplication;

        /**
         * Gets the value of the serviceRequest2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceRequest2() {
            return serviceRequest2;
        }

        /**
         * Sets the value of the serviceRequest2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceRequest2(String value) {
            this.serviceRequest2 = value;
        }

        /**
         * Gets the value of the versionNumber property.
         * 
         */
        public int getVersionNumber() {
            return versionNumber;
        }

        /**
         * Sets the value of the versionNumber property.
         * 
         */
        public void setVersionNumber(int value) {
            this.versionNumber = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         */
        public long getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         */
        public void setEffectiveDate(long value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the initiatedDate property.
         * 
         */
        public long getInitiatedDate() {
            return initiatedDate;
        }

        /**
         * Sets the value of the initiatedDate property.
         * 
         */
        public void setInitiatedDate(long value) {
            this.initiatedDate = value;
        }

        /**
         * Gets the value of the initiatedTime property.
         * 
         */
        public long getInitiatedTime() {
            return initiatedTime;
        }

        /**
         * Sets the value of the initiatedTime property.
         * 
         */
        public void setInitiatedTime(long value) {
            this.initiatedTime = value;
        }

        /**
         * Gets the value of the initiatingCo property.
         * 
         */
        public long getInitiatingCo() {
            return initiatingCo;
        }

        /**
         * Sets the value of the initiatingCo property.
         * 
         */
        public void setInitiatingCo(long value) {
            this.initiatingCo = value;
        }

        /**
         * Gets the value of the operator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperator() {
            return operator;
        }

        /**
         * Sets the value of the operator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperator(String value) {
            this.operator = value;
        }

        /**
         * Gets the value of the operatorBranch property.
         * 
         */
        public long getOperatorBranch() {
            return operatorBranch;
        }

        /**
         * Sets the value of the operatorBranch property.
         * 
         */
        public void setOperatorBranch(long value) {
            this.operatorBranch = value;
        }

        /**
         * Gets the value of the workstationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkstationId() {
            return workstationId;
        }

        /**
         * Sets the value of the workstationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkstationId(String value) {
            this.workstationId = value;
        }

        /**
         * Gets the value of the originatingApplication property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginatingApplication() {
            return originatingApplication;
        }

        /**
         * Sets the value of the originatingApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginatingApplication(String value) {
            this.originatingApplication = value;
        }

    }


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
     *         &lt;element name="ProcessingApplication">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AccountNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="23"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RegistrationNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PICX__string">
     *               &lt;maxLength value="23"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LinkageNumber">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__short">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="99"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "processingApplication",
        "accountNumber",
        "registrationNumber",
        "linkageNumber"
    })
    public static class SecondaryHeader {

        @XmlElement(name = "ProcessingApplication", required = true, defaultValue = " ")
        protected String processingApplication;
        @XmlElement(name = "AccountNumber", required = true, defaultValue = " ")
        protected String accountNumber;
        @XmlElement(name = "RegistrationNumber", required = true, defaultValue = " ")
        protected String registrationNumber;
        @XmlElement(name = "LinkageNumber", defaultValue = "0")
        protected int linkageNumber;

        /**
         * Gets the value of the processingApplication property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessingApplication() {
            return processingApplication;
        }

        /**
         * Sets the value of the processingApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessingApplication(String value) {
            this.processingApplication = value;
        }

        /**
         * Gets the value of the accountNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the registrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationNumber() {
            return registrationNumber;
        }

        /**
         * Sets the value of the registrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationNumber(String value) {
            this.registrationNumber = value;
        }

        /**
         * Gets the value of the linkageNumber property.
         * 
         */
        public int getLinkageNumber() {
            return linkageNumber;
        }

        /**
         * Sets the value of the linkageNumber property.
         * 
         */
        public void setLinkageNumber(int value) {
            this.linkageNumber = value;
        }

    }


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
     *         &lt;element name="NoToRetrieve">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__short">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="99"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NextTransactionStart">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TransactionProcessDate">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.ibm.com/dfdl/CobolDataDefinitionFormat}PIC9-Display-Zoned__int">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="99999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "noToRetrieve",
        "nextTransactionStart",
        "transactionProcessDate"
    })
    public static class ServiceRequestMsg {

        @XmlElement(name = "NoToRetrieve", defaultValue = "0")
        protected int noToRetrieve;
        @XmlElement(name = "NextTransactionStart", defaultValue = "0")
        protected long nextTransactionStart;
        @XmlElement(name = "TransactionProcessDate", defaultValue = "0")
        protected long transactionProcessDate;

        /**
         * Gets the value of the noToRetrieve property.
         * 
         */
        public int getNoToRetrieve() {
            return noToRetrieve;
        }

        /**
         * Sets the value of the noToRetrieve property.
         * 
         */
        public void setNoToRetrieve(int value) {
            this.noToRetrieve = value;
        }

        /**
         * Gets the value of the nextTransactionStart property.
         * 
         */
        public long getNextTransactionStart() {
            return nextTransactionStart;
        }

        /**
         * Sets the value of the nextTransactionStart property.
         * 
         */
        public void setNextTransactionStart(long value) {
            this.nextTransactionStart = value;
        }

        /**
         * Gets the value of the transactionProcessDate property.
         * 
         */
        public long getTransactionProcessDate() {
            return transactionProcessDate;
        }

        /**
         * Sets the value of the transactionProcessDate property.
         * 
         */
        public void setTransactionProcessDate(long value) {
            this.transactionProcessDate = value;
        }

    }

}