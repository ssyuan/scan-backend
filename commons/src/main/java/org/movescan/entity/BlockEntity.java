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
@Table(name = "block")
public class BlockEntity {
    @JSONField(name = "author")
    @Column(name = "author")
    private String author;
    @Column(name = "block_accumulator_root")
    @JSONField(name = "block_accumulator_root")
    @ApiModelProperty(value = "accumulator_root")
    private String blockAccumulatorRoot;
    @Id
    @Column(name = "block_hash")
    @JSONField(name = "block_hash")
    @ApiModelProperty(value = "block_hash")
    private String blockHash;
    @Column(name = "body_hash")
    @JSONField(name = "body_hash")
    private String bodyHash;
    @Column(name = "chain_id")
    @JSONField(name = "chain_id")
    private int chainId;
    @Column(name = "difficulty")
    @JSONField(name = "difficulty")
    private String difficulty;
    @Column(name = "extra")
    @JSONField(name = "extra")
    private String extra;
    @Column(name = "gas_used")
    @JSONField(name = "gas_used")
    private long gasUsed;
    @Column(name = "nonce")
    @JSONField(name = "nonce")
    private long nonce;
    @Column(name = "height")
    @JSONField(name = "height")
    private long height; //uint_64
    @Column(name = "parent_hash")
    @JSONField(name = "parent_hash")
    private String parentHash;
    @Column(name = "state_root")
    @JSONField(name = "state_root")
    private String stateRoot;
    @Column(name = "txn_accumulator_root")
    @JSONField(name = "txn_accumulator_root")
    private String txnAccumulatorRoot;
    @Column(name = "create_at")
    @JSONField(name = "create_at")
    private Date createAt;
}