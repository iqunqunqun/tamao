package com.ivan.tamao.entity;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.ivan.tamao.base.BaseEntity;
import com.ivan.tamao.bo.SysUserBO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author ivan
 * @since 2021-07-18
 */
@Data
@EqualsAndHashCode
public class SysUser {

    private static final long serialVersionUID = 1L;

    /**
     * 用户表主键
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像URL
     */
    private String avatar;

    /**
     * 用户状态(0-正常，1-关闭)
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


    public static SysUser convert(SysUserBO sysUserBO) {
        SysUser sysUser = new SysUser();
        BeanUtil.copyProperties(sysUserBO, sysUser);
        return sysUser;
    }

}
