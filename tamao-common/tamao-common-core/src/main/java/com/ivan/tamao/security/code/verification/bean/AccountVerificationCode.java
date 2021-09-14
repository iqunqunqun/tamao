package com.ivan.tamao.security.code.verification.bean;

import com.ivan.tamao.security.code.BaseCode;
import com.ivan.tamao.security.code.verification.bean.group.AccountBindGroup;
import com.ivan.tamao.security.code.verification.bean.group.RegisterGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <p>账号绑定验证码</p>
 *
 * @author ivan
 * @className AccountBindVerificationCode
 * @since 2021/7/24 15:49
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountVerificationCode extends BaseCode {

    /**
     * 用户ID
     */
    @NotNull(message = "未知用户", groups = {AccountBindGroup.class})
    private Long userId;

    /**
     * 用户手机号
     */
    @NotBlank(message = "请输入手机号", groups = {RegisterGroup.class})
    private String phone;

}
