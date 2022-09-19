package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class Block extends BeanBase {
    @JSONField(name = "metadata")
    BlockMetadata blockMetadata;
    @JSONField(name = "uncles")
    List<BlockHeader> uncles;
    @JSONField(name = "header")
    private BlockHeader header;
    private BlockBody body;
    @JSONField(serialize = false)
    private List<Transaction> transactionList;
}
