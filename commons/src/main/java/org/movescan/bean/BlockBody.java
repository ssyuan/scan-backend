package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class BlockBody {
    @JSONField(name = "Full")
    List<UserTransaction> userTransactions;
}
