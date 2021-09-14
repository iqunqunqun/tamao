package com.ivan.tamao.security.code.enumerate;

/**
 * <p>验证枚举类</p>
 *
 * @author ivan
 * @className Verification
 * @since 2021/7/24 15:17
 */
public enum CodeEnum {

    /**
     * 消息验证码
     */
    MESSAGE(1, "message"),

    /**
     * 图片验证码
     */
    PICTURE(2, "picture"),

    ;

    private final int type;

    private final String code;

    CodeEnum(int type, String code) {
        this.type = type;
        this.code = code;
    }

    public int type() {
        return type;
    }

    public String code() {
        return code;
    }
}
