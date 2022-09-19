package org.movescan.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.movescan.bean.TransactionType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "transactions")
public class TransactionEntity {
    @JSONField(name = "txn_type")
    @Column(name = "txn_type")
    private TransactionType transactionType;
    @Column(name = "block_accumulator_root")
    @JSONField(name = "block_accumulator_root")
    private String blockAccumulatorRoot;
    @Column(name = "block_hash")
    @JSONField(name = "block_hash")
    private String blockHash;
    @Column(name = "block_number")
    @JSONField(name = "block_number")
    private long blockNumber;
    @Column(name = "payload")
    @JSONField(name = "payload")
    private String payload;
    @Column(name = "global_index")
    @JSONField(name = "global_index")
    private long globalIndex;
    @Id
    @Column(name = "txn_hash")
    @JSONField(name = "txn_hash")
    private String txnHash;
    @Column(name = "state_root_hash")
    @JSONField(name = "state_root_hash")
    private String stateRootHash;
    @Column(name = "event_root_hash")
    @JSONField(name = "event_root_hash")
    private String eventRootHash;
    @Column(name = "gas_used")
    @JSONField(name = "gas_used")
    private long gasUsed;
    @Column(name = "success")
    @JSONField(name = "success")
    private boolean success;
    @Column(name = "vm_status")
    @JSONField(name = "vm_status")
    private String vmStatus;
    @Column(name = "accumulator_root_hash")
    @JSONField(name = "accumulator_root_hash")
    private String accumulatorRootHash;
    @Column(name = "create_at")
    @JSONField(name = "create_at")
    private Date createAt;
}
