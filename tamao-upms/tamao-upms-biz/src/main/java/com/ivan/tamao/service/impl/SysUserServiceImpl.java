package com.ivan.tamao.service.impl;

import com.ivan.tamao.bo.BindEmailBO;
import com.ivan.tamao.bo.SysUserBO;
import com.ivan.tamao.entity.SysUser;
import com.ivan.tamao.mapper.SysUserMapper;
import com.ivan.tamao.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ivan.tamao.vo.SysUserVO;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ivan
 * @since 2021-07-18
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public boolean saveUser(SysUserBO sysUserBO) {
        return this.save(SysUser.convert(sysUserBO));
    }

    @Override
    public SysUserVO detail(Long userId) {
        return this.baseMapper.detail(userId);
    }

    @Override
    public boolean bindEmail(BindEmailBO bindEmailBO) {

        return false;
    }
}
