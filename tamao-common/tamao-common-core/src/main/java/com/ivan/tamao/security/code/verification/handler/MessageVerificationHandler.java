package com.ivan.tamao.security.code.verification.handler;

import com.ivan.tamao.security.code.CodeHandler;
import com.ivan.tamao.security.code.enumerate.CodeEnum;
import com.ivan.tamao.security.code.verification.bean.AccountVerificationCode;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author ivan
 * @className MessageVerificationHandler
 * @since 2021/7/24 15:11
 */
@Component
public class MessageVerificationHandler implements CodeHandler<AccountVerificationCode> {

    @Override
    public String handle(AccountVerificationCode code) {
        return null;
    }

    @Override
    public int getType() {
        return CodeEnum.MESSAGE.type();
    }
}
