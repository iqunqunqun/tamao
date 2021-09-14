package com.ivan.tamao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>UPMS启动类</p>
 *
 * @author ivan
 * @className UPMSApplication
 * @since 2021/7/18 19:28
 */

@SpringBootApplication
@MapperScan({"com.ivan.tabao.mapper.*"})
public class UPMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(UPMSApplication.class, args);
    }
}
