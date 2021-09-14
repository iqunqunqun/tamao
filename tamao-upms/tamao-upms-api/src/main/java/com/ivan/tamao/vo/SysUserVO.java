package com.ivan.tamao.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author ivan
 * @className SysUserVO
 * @since 2021/7/18 22:49
 */
@Data
@EqualsAndHashCode
public class SysUserVO implements Serializable {

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

}
