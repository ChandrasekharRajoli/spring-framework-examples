package com.chandra.springboot.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TRANSACTIONS")
@NoArgsConstructor
@ApiModel(description = "Transaction Model")
public class Transactions implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3483672552912097590L;
    
    @Id
    @Column(name = "TXN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "Unique Transaction Id", example = "78652465", allowEmptyValue = false)
    @Getter @Setter 
    private Long txnId;
    
    @Column(name = "TXN_DT")
    @ApiModelProperty(notes = "Transaction Date", example = "2018-06-03")
    @CreatedDate
    @Getter @Setter 
    private Date txnDate;
    
    @Column(name = "TXN_AMT")
    @ApiModelProperty(notes = "Transaction Amount", example = "200.25")
    @Getter @Setter 
    private BigDecimal txnAmount;
    
    @Column(name = "TXN_ACCNT_NO")
    @ApiModelProperty(notes = "Transaction Account Number", example = "78652465")
    @Getter @Setter 
    private Long txnAccountNo;
    
    @Column(name = "TXN_ACCNT_NAME")
    @ApiModelProperty(notes = "Transaction Account Holder Name", example = "John")
    @Getter @Setter 
    private String txnAccountName;
    
    @Column(name = "TXN_SRC_CTRY")
    @ApiModelProperty(notes = "Transaction Source Country", example = "IND")
    @Getter @Setter 
    private String txnSourceCountry;
    
    @Column(name = "TXN_DEST_CTRY")
    @ApiModelProperty(notes = "Transaction Destination Country", example = "USA")
    @Getter @Setter 
    private String txnDestCountry;
    
    @Column(name = "TXN_CREATED_TIME")
    @ApiModelProperty(notes = "Transaction Created TimeStamp", example = "2018-06-03T05:23:48.68")
    @JsonFormat(pattern= "yyyy-MM-dd'T'HH:mm:ss.SSS", shape=Shape.STRING)
    @CreationTimestamp
    @Getter @Setter 
    private Timestamp txnCreatedTime;
    
    @Column(name = "TXN_CREATED_BY")
    @ApiModelProperty(notes = "Transaction Created By", example = "Chandra")
    @CreatedBy
    @Getter @Setter 
    private String txnCreatedBy;

    

    public Long getTxnId() {
        return txnId;
    }



    public void setTxnId(Long txnId) {
        this.txnId = txnId;
    }



    public Date getTxnDate() {
        return txnDate;
    }



    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }



    public BigDecimal getTxnAmount() {
        return txnAmount;
    }



    public void setTxnAmount(BigDecimal txnAmount) {
        this.txnAmount = txnAmount;
    }



    public Long getTxnAccountNo() {
        return txnAccountNo;
    }



    public void setTxnAccountNo(Long txnAccountNo) {
        this.txnAccountNo = txnAccountNo;
    }



    public String getTxnAccountName() {
        return txnAccountName;
    }



    public void setTxnAccountName(String txnAccountName) {
        this.txnAccountName = txnAccountName;
    }



    public String getTxnSourceCountry() {
        return txnSourceCountry;
    }



    public void setTxnSourceCountry(String txnSourceCountry) {
        this.txnSourceCountry = txnSourceCountry;
    }



    public String getTxnDestCountry() {
        return txnDestCountry;
    }



    public void setTxnDestCountry(String txnDestCountry) {
        this.txnDestCountry = txnDestCountry;
    }



    public Timestamp getTxnCreatedTime() {
        return txnCreatedTime;
    }



    public void setTxnCreatedTime(Timestamp txnCreatedTime) {
        this.txnCreatedTime = txnCreatedTime;
    }



    public String getTxnCreatedBy() {
        return txnCreatedBy;
    }



    public void setTxnCreatedBy(String txnCreatedBy) {
        this.txnCreatedBy = txnCreatedBy;
    }



    public Transactions(BigDecimal txmAmount, Long txnAccountNo, String txnAccountName,
            String txnSourceCountry, String txnDestCountry) {
        this.txnAmount = txmAmount;
        this.txnAccountNo = txnAccountNo;
        this.txnAccountName = txnAccountName;
        this.txnSourceCountry = txnSourceCountry;
        this.txnDestCountry = txnDestCountry;
    }
    
    
}
