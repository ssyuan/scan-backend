package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Event {
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
    String data;
    @JSONField(name = "type_tag")
    String typeTag;
    @JSONField(name = "event_key")
    String eventKey;
    @JSONField(name = "event_seq_number")
    String eventSeqNumber;
    @JSONField(name = "decode_event_data")
    String decodeEventData;
}
