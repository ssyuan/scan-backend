package org.movescan.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Authenticator {
    @JSONField(name = "Ed25519")
    Ed25519 ed25519;
}
