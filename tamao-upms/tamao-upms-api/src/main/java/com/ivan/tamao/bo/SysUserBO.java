package com.ivan.tamao.bo;

import com.ivan.tamao.entity.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <p></p>
 *
 * @author ivan
 * @className SysUserBO
 * @since 2021/7/18 19:45
 */

@Data
@EqualsAndHashCode
public class SysUserBO implements Serializable {

    /**
     * 用户名称
     */
    @NotBlank(message = "用户名不能为空")
    @Range(message = "用户名不能超过{max}个字符", max = 10)
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

}
