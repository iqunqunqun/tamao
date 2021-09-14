package com.ivan.tamao.security.code;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>验证码父类</p>
 *
 * @author ivan
 * @className BaseVerification
 * @since 2021/7/24 14:56
 */

@Data
@EqualsAndHashCode
public class BaseCode implements Serializable {

    /**
     * 验证码类型
     */
    @NotNull(message = "无效验证类型")
    private int verificationType;

    /**
     * 输入验证码时间
     */
    @NotNull(message = "验证码已过期")
    private LocalDateTime verificationTime;

    /**
     * 验证码
     */
    @NotBlank(message = "请输入验证码")
    private String verificationCode;

}
