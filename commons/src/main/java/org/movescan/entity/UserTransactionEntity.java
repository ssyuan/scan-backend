package org.movescan.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "user_transactions")
public class UserTransactionEntity {
    @Id
    @Column(name = "txn_hash")
    @JSONField(name = "txn_hash")
    @ApiModelProperty(value = "txn_hash")
    private String txnHash;
    @Column(name = "signature")
    @JSONField(name = "signature")
    @ApiModelProperty(value = "signature")
    private String signature;
    @Column(name = "sender")
    @JSONField(name = "sender")
    @ApiModelProperty(value = "sender")
    private String sender;
    @Column(name = "sequence_number")
    @JSONField(name = "sequence_number")
    @ApiModelProperty(value = "sequence_number")
    private long sequenceNumber;
    @Column(name = "max_gas_amount")
    @JSONField(name = "max_gas_amount")
    @ApiModelProperty(value = "max_gas_amount")
    private long maxGasAmount;
    @Column(name = "expiration_secs")
    @JSONField(name = "expiration_secs")
    @ApiModelProperty(value = "expiration_secs")
    private Date expirationSecs;
    @Column(name = "gas_unit_price")
    @JSONField(name = "gas_unit_price")
    @ApiModelProperty(value = "gas_unit_price")
    private long gasUnitPrice;
    @Column(name = "chain_time")
    @JSONField(name = "chain_time")
    @ApiModelProperty(value = "chain_time")
    private Date ChainTime;
    @Column(name = "create_at")
    @JSONField(name = "create_at")
    @ApiModelProperty(value = "create_at")
    private Date createAt;
}