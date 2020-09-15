package com.github.panhongan.bean2sql.condition.sql;

import com.github.panhongan.bean2sql.condition.ConditionOperator;
import lombok.Builder;

/**
 * 示例：
 * obj.f1 = 100
 * obj.f2 = 20
 *
 * sql : f1 &gt; ? and f2 &gt; ?
 * vaues: (1, 100), (2, 20)
 * 
 * @param <T> 包含大于字段的对象
 * @author panhongan
 * @since 2019.7.10
 * @version 1.0
 */

public class GreaterCondition<T> extends AbstractComparableCondition<T> {

    @Override
    public ConditionOperator getConditionOperator() {
        return ConditionOperator.GREATER;
    }
}
