package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BlockHeader {
    long timestamp;
    private String author;
    @JSONField(name = "author_auth_key")
    private String authorAuthKey;
    @JSONField(name = "block_accumulator_root")
    private String blockAccumulatorRoot;
    @JSONField(name = "block_hash")
    private String blockHash;
    @JSONField(name = "body_hash")
    private String bodyHash;
    @JSONField(name = "chain_id")
    private int chainId;
    @JSONField(name = "difficulty")
    private String difficultyHexStr;
    @JSONField(name = "difficulty_number")
    private long difficulty;
    private String extra;
    @JSONField(name = "gas_used")
    private long gasUsed;
    private long nonce;
    @JSONField(name = "number")
    private long height;
    @JSONField(name = "parent_hash")
    private String parentHash;
    @JSONField(name = "state_root")
    private String stateRoot;
    @JSONField(name = "txn_accumulator_root")
    private String txnAccumulatorRoot;
}
