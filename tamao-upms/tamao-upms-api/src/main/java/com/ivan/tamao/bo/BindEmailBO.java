package com.ivan.tamao.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <p>邮箱绑定</p>
 *
 * @author ivan
 * @className BindEmailBO
 * @since 2021/7/22 19:57
 */
@Data
@EqualsAndHashCode
public class BindEmailBO implements Serializable {

    /**
     * 用户ID
     */
    @NotNull(message = "参数错误")
    private Long userId;

    /**
     * 邮箱地址
     */
    @Email(message = "请输入正确的邮箱")
    private String email;

    /**
     * 验证码
     */
    @NotBlank(message = "验证码为空")
    private String code;

    /**
     * 密码
     */
    @NotBlank(message = "请输入密码")
    private String password;

}
