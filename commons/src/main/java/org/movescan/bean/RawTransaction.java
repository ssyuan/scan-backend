package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RawTransaction {
    @JSONField(name = "sequence_number")
    String sequenceNumber;
    @JSONField(name = "chain_id")
    int chainId;
    @JSONField(name = "sender")
    String sender;
    @JSONField(name = "payload")
    String payload;
    @JSONField(serialize = false)
    TransactionPayload transactionPayload;
    @JSONField(name = "gas_unit_price")
    String gasUnitPrice;
    @JSONField(name = "gas_token_code")
    String gasTokenCode;
    @JSONField(name = "max_gas_amount")
    String maxGasAmount;
    @JSONField(name = "expiration_timestamp_secs")
    String expirationTimestampSecs;
    @JSONField(name = "authenticator")
    Authenticator authenticator;
    @JSONField(name = "transaction_hash")
    String transactionHash;
}
