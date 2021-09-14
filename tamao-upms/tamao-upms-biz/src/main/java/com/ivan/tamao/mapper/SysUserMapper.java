package com.ivan.tamao.mapper;

import com.ivan.tamao.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ivan.tamao.vo.SysUserVO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ivan
 * @since 2021-07-18
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 用户详情
     *
     * @param userId
     * @return
     */
    SysUserVO detail(@Param("userId") Long userId);
}
