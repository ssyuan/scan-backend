package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UserTransaction {
    @JSONField(name = "transaction_hash")
    String transactionHash;
    @JSONField(name = "raw_txn")
    RawTransaction rawTransaction;
    Authenticator authenticator;
}
