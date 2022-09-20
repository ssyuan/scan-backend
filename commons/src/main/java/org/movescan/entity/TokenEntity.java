package org.movescan.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "token")
public class TokenEntity {
    @Id
    @JSONField(name = "type_tag")
    @Column(name = "type_tag")
    @ApiModelProperty(value = "type_tag")
    private String typeTag;
    @JSONField(name = "creator")
    @Column(name = "creator")
    @ApiModelProperty(value = "creator")
    private String creator;
    @JSONField(name = "maximum")
    @Column(name = "maximum")
    @ApiModelProperty(value = "maximum")
    private BigInteger maximum;
    @JSONField(name = "supply")
    @Column(name = "supply")
    @ApiModelProperty(value = "supply")
    private BigInteger supply;
    @JSONField(name = "holders")
    @Column(name = "holders")
    @ApiModelProperty(value = "holders")
    private long holders;
    @Column(name = "create_at")
    @JSONField(name = "create_at")
    @ApiModelProperty(value = "create_at")
    private Date createAt;

}
