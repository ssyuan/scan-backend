package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BlockMetadata {
    @JSONField(name = "parent_hash")
    String parentHash;
    long timestamp;
    String author;
    @JSONField(name = "author_auth_key")
    String authorAuthKey;
    String uncles;
    String number;
    @JSONField(name = "chain_id")
    String chainId;
    @JSONField(name = "parent_gas_used")
    long parentGasUsed;
}
