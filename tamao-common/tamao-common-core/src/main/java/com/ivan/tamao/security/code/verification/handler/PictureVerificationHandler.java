package com.ivan.tamao.security.code.verification.handler;

import com.ivan.tamao.security.code.CodeHandler;
import com.ivan.tamao.security.code.verification.bean.PictureVerificationCode;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author ivan
 * @className PictureVerificationHandler
 * @since 2021/7/25 21:07
 */
@Component
public class PictureVerificationHandler implements CodeHandler<PictureVerificationCode> {

    @Override
    public String handle(PictureVerificationCode code) {
        return null;
    }

    @Override
    public int getType() {
        return 0;
    }
}
