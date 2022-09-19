package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class Transaction extends BeanBase {
    @JSONField(name = "block_hash")
    String blockHash;
    @JSONField(name = "block_number")
    String blockNumber;
    @JSONField(name = "transaction_hash")
    String transactionHash;
    @JSONField(name = "transaction_index")
    int transactionIndex;
    @JSONField(name = "transaction_global_index")
    long transactionGlobalIndex;
    @JSONField(name = "state_root_hash")
    String stateRootHash;
    @JSONField(name = "event_root_hash")
    String eventRootHash;
    @JSONField(name = "gas_used")
    String gasUsed;
    String status;
    long timestamp;
    @JSONField(name = "user_transaction")
    UserTransaction userTransaction;
    @JSONField(name = "block_metadata")
    BlockMetadata blockMetadata;
    @JSONField(serialize = false)
    List<Event> events;
    @JSONField(name = "transaction_type")
    TransactionType transactionType;
}
