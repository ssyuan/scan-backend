package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Ed25519 {
    @JSONField(name = "public_key")
    String publicKey;
    @JSONField(name = "signature")
    String signature;
}
