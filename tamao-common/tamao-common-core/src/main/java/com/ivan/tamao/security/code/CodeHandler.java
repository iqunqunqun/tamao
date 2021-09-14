package com.ivan.tamao.security.code;

/**
 * <p></p>
 *
 * @author ivan
 * @className CodeHandler
 * @since 2021/8/1 13:05
 */
public interface CodeHandler<T extends BaseCode> {

    /**
     * 处理验证码
     *
     * @return 验证码
     */
    String handle(T code);

    /**
     * 获取验证码类型
     *
     * @return 验证码类型
     */
    int getType();

}
