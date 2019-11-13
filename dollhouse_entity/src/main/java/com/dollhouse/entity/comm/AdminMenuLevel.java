package com.dollhouse.entity.comm;

import com.dollhouse.core.annotation.Table;
import com.dollhouse.core.annotation.Column;
import com.dollhouse.core.entity.BaseEntity;
 
/**
 * This code is generated by FreeMarker
 */
 @Table(name="admin_menu_level")
public class AdminMenuLevel extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    @Column(name="name")
    private String name;
    
    @Column(name="admin_level")
    private String adminLevel;
    
    @Column(name="status")
    private Long status;

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    public String getAdminLevel() {
        return adminLevel;
    }
 
    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }

    public Long getStatus() {
        return status;
    }
 
    public void setStatus(Long status) {
        this.status = status;
    }
}