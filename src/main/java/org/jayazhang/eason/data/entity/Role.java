package org.jayazhang.eason.data.entity;


import org.jayazhang.eason.data.base.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 角色表
 * Created by jay on 2016-10-13.
 */
@Entity
@Table(name = "role")
public class Role extends Data implements Serializable {

    @NotNull
    @Column(name = "name", columnDefinition = "varchar(30) COMMENT '角色名'")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
