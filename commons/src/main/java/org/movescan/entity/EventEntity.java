package org.movescan.entity;


import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "events")
public class EventEntity {
    @EmbeddedId
    private EventId eventId;
    @Column(name = "txn_hash")
    @JSONField(name = "txn_hash")
    @ApiModelProperty(value = "txn_hash")
    private String txnHash;
    @Column(name = "type_tag")
    @JSONField(name = "type_tag")
    @ApiModelProperty(value ="type_tag")
    private String typeTag;
    @Column(name = "event_data")
    @JSONField(name = "event_data")
    @ApiModelProperty(value = "event_data")
    private String eventData;
    @Column(name = "global_index")
    @JSONField(name = "global_index")
    @ApiModelProperty(value = "global_index")
    private long globalIndex;
    @Column(name = "create_at")
    @JSONField(name = "create_at")
    @ApiModelProperty(value = "create_at")
    private Date createAt;
}

@Embeddable
@Data
class EventId implements Serializable {
    @Column(name = "event_key")
    @JSONField(name = "event_key")
    @ApiModelProperty(value = "event_key")
    private String eventKey;
    @Column(name = "event_sequence_number")
    @JSONField(name = "event_sequence_number")
    @ApiModelProperty(value = "event_sequence_number")
    private long eventSequenceNumber;
}