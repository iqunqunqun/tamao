package com.ivan.tamao.service;

import com.ivan.tamao.bo.BindEmailBO;
import com.ivan.tamao.bo.SysUserBO;
import com.ivan.tamao.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ivan.tamao.vo.SysUserVO;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ivan
 * @since 2021-07-18
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 保存用户
     *
     * @param sysUserBO
     * @return
     */
    boolean saveUser(SysUserBO sysUserBO);

    /**
     * 用户信息
     *
     * @param userId
     * @return
     */
    SysUserVO detail(Long userId);

    /**
     * 绑定邮箱
     *
     * @param bindEmailBO
     * @return
     */
    boolean bindEmail(BindEmailBO bindEmailBO);
}
