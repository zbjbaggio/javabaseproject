package org.jayazhang.eason.data.entity;


import org.jayazhang.eason.data.base.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 菜单表
 * Created by jay on 2016-10-13.
 */
@Entity
@Table(name = "menu")
public class Menu extends Data implements Serializable {

    @NotNull
    @Column(name = "name", columnDefinition = "varchar(30) COMMENT '菜单名'")
    private String name;

    @NotNull
    @Column(name = "url", columnDefinition = "varchar(40) COMMENT 'url地址'")
    private String url;

    @NotNull
    @Column(name = "code", columnDefinition = "varchar(40) COMMENT '编号'")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
