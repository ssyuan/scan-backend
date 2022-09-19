package org.movescan.bean;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

@Data
public class BeanBase {
    @JSONField(name = "_id")
    String id;
}
