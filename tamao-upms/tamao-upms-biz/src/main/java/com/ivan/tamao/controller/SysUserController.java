package com.ivan.tamao.controller;


import com.ivan.tamao.bo.BindEmailBO;
import com.ivan.tamao.bo.SysUserBO;
import com.ivan.tamao.service.ISysUserService;
import com.ivan.tamao.tool.api.annotation.CustomResponse;
import com.ivan.tamao.vo.SysUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ivan
 * @since 2021-07-18
 */

@RestController
@RequestMapping("/sys-user")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;


    /**
     * 注册用户
     *
     * @param sysUserBO
     * @return boolean
     */
    @PostMapping("/register")
    public boolean register(@RequestBody @Valid SysUserBO sysUserBO) {
        return sysUserService.saveUser(sysUserBO);
    }

    /**
     * 用户详情
     *
     * @param userId 用户ID
     * @return
     */
    @CustomResponse
    @GetMapping("/detail")
    public SysUserVO detail(@RequestParam("userId") Long userId) {
        return sysUserService.detail(userId);
    }

    @CustomResponse
    @PostMapping("/email")
    public boolean bindEmail(@RequestBody @Valid BindEmailBO bindEmailBO) {
        return sysUserService.bindEmail(bindEmailBO);
    }
}
