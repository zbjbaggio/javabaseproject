package org.jayazhang.eason.data.entity;

import org.jayazhang.eason.data.base.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 角色菜单关系表
 * Created by jay on 2016-10-13.
 */

@Entity
@Table(name = "role_menu")
public class RoleMenu  extends Data implements Serializable {

    @NotNull
    @Column(name = "role_id", columnDefinition = "BIGINT(20) COMMENT '角色id'")
    private long roleId;

    @NotNull
    @Column(name = "menu_id", columnDefinition = "BIGINT(20) COMMENT '菜单id'")
    private long menuId;

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }
}
