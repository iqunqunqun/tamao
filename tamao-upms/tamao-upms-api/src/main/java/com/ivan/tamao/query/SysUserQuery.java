package com.ivan.tamao.query;

import com.ivan.tamao.base.BaseQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p></p>
 *
 * @author ivan
 * @className UserQuery
 * @since 2021/7/18 22:50
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserQuery extends BaseQuery {

    private Long userId;
}
