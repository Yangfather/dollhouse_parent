package com.dollhouse.entity.comm;

import java.math.BigDecimal;
import com.dollhouse.core.annotation.Table;
import com.dollhouse.core.annotation.Column;
import com.dollhouse.core.entity.BaseEntity;
 
/**
 * This code is generated by FreeMarker
 */
 @Table(name="doll_name")
public class DollName extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    @Column(name="doll_goods_name")
    private String dollGoodsName;
    
    @Column(name="doll_organcode")
    private Long dollOrgancode;
    
    @Column(name="doll_img_url")
    private String dollImgUrl;
    
    @Column(name="doll_color")
    private String dollColor;
    
    @Column(name="doll_type")
    private String dollType;
    
    @Column(name="doll_status")
    private Long dollStatus;
    
    @Column(name="lower_price")
    private BigDecimal lowerPrice;
    
    @Column(name="heigher_price")
    private BigDecimal heigherPrice;
    
    @Column(name="despriton")
    private String despriton;

    public String getDollGoodsName() {
        return dollGoodsName;
    }
 
    public void setDollGoodsName(String dollGoodsName) {
        this.dollGoodsName = dollGoodsName;
    }

    public Long getDollOrgancode() {
        return dollOrgancode;
    }
 
    public void setDollOrgancode(Long dollOrgancode) {
        this.dollOrgancode = dollOrgancode;
    }

    public String getDollImgUrl() {
        return dollImgUrl;
    }
 
    public void setDollImgUrl(String dollImgUrl) {
        this.dollImgUrl = dollImgUrl;
    }

    public String getDollColor() {
        return dollColor;
    }
 
    public void setDollColor(String dollColor) {
        this.dollColor = dollColor;
    }

    public String getDollType() {
        return dollType;
    }
 
    public void setDollType(String dollType) {
        this.dollType = dollType;
    }

    public Long getDollStatus() {
        return dollStatus;
    }
 
    public void setDollStatus(Long dollStatus) {
        this.dollStatus = dollStatus;
    }

    public BigDecimal getLowerPrice() {
        return lowerPrice;
    }
 
    public void setLowerPrice(BigDecimal lowerPrice) {
        this.lowerPrice = lowerPrice;
    }

    public BigDecimal getHeigherPrice() {
        return heigherPrice;
    }
 
    public void setHeigherPrice(BigDecimal heigherPrice) {
        this.heigherPrice = heigherPrice;
    }

    public String getDespriton() {
        return despriton;
    }
 
    public void setDespriton(String despriton) {
        this.despriton = despriton;
    }
}