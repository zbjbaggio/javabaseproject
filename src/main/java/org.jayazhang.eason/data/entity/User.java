package org.jayazhang.eason.data.entity;

import org.jayazhang.eason.data.base.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户表
 * Created by jay on 2016-10-13.
 */

@Entity
@Table(name = "user")
public class User extends Data implements Serializable {

    @NotNull
    @Column(name = "name", columnDefinition = "varchar(30) COMMENT '用户名'")
    private String name;

    @NotNull
    @Column(name = "phone", columnDefinition = "varchar(20) COMMENT '手机号'")
    private String phone;

    @NotNull
    @Column(name = "email", columnDefinition = "varchar(50) COMMENT '邮箱'")
    private String email;

    @NotNull
    @Column(name = "password", columnDefinition = "varchar(20) COMMENT '密码'")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
