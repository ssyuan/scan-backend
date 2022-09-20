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
@Table(name = "address")
public class AddressEntity {
    @Id
    @Column(name = "address")
    @JSONField(name = "address")
    @ApiModelProperty(value = "address")
    private String address;
    @Column(name = "supply")
    @JSONField(name = "supply")
    @ApiModelProperty(value = "supply")
    private BigInteger supply;
    @Column(name = "hold_amount")
    @JSONField(name = "hold_amount")
    @ApiModelProperty(value = "hold_amount")
    private BigInteger holdAmount;
    @Column(name = "create_at")
    @JSONField(name = "create_at")
    @ApiModelProperty(value = "create_at")
    private Date createAt;
}
