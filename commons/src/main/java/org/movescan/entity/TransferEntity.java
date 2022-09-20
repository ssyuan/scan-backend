package org.movescan.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "transfers")
public class TransferEntity {
    @Id
    @Column(name = "txn_hash")
    @JSONField(name = "txn_hash")
    @ApiModelProperty(value = "txn_hash")
    private String txnHash;
    @Column(name = "sender")
    @JSONField(name = "sender")
    @ApiModelProperty(value = "sender")
    private String sender;
    @Column(name = "receiver")
    @JSONField(name = "receiver")
    @ApiModelProperty(value = "receiver")
    private String receiver;
    @Column(name = "amount")
    @JSONField(name = "amount")
    @ApiModelProperty(value = "amount")
    private String amount;
    @Column(name = "amount_value")
    @JSONField(name = "amount_value")
    @ApiModelProperty(value = "amount_value")
    private BigInteger amountValue;
    @Column(name = "type_tag")
    @JSONField(name = "type_tag")
    @ApiModelProperty(value = "type_tag")
    private String typeTag;
    @Column(name = "create_at")
    @JSONField(name = "create_at")
    @ApiModelProperty(value = "create_at")
    private Date createAt;
    @Column(name = "identifier")
    @JSONField(name = "identifier")
    @ApiModelProperty(value = "identifier")
    private String identifier;




}
