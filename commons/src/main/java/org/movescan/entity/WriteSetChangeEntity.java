package org.movescan.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "write_set_changes")
public class WriteSetChangeEntity {
    @EmbeddedId
    private ChangeId changeId;
    @Column(name = "change_type")
    @JSONField(name = "change_type")
    @ApiModelProperty(value = "change_type")
    private String changeType;
    @Column(name = "address")
    @JSONField(name = "address")
    @ApiModelProperty(value = "address")
    private String address;
    @Column(name = "change_data")
    @JSONField(name = "change_data")
    @ApiModelProperty(value = "change_data")
    private String changeData;
    @Column(name = "create_at")
    @JSONField(name = "create_at")
    @ApiModelProperty(value = "create_at")
    private Date createAt;
}

@Embeddable
@Data
class ChangeId implements Serializable {
    @Column(name = "txn_hash")
    @JSONField(name = "txn_hash")
    @ApiModelProperty(value = "txn_hash")
    private String txnHash;
    @Column(name = "state_key_hash")
    @JSONField(name = "state_key_hash")
    @ApiModelProperty(value = "state_key_hash")
    private String stateKeyHash;
}