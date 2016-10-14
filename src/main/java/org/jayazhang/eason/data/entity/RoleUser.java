package org.jayazhang.eason.data.entity;

import org.jayazhang.eason.data.base.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 角色用户关系表
 * Created by jay on 2016-10-13.
 */
public class RoleUser extends Data implements Serializable {

    @NotNull
    @Column(name = "role_id", columnDefinition = "BIGINT(20) COMMENT '角色id'")
    private long roleId;

    @NotNull
    @Column(name = "user_id", columnDefinition = "BIGINT(20) COMMENT '用户id'")
    private long userId;
}
