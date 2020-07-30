package com.github.panhongan.condition.sql;

import com.github.panhongan.condition.ConditionOperator;
import com.github.panhongan.condition.common.Bean2SqlUtils;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;

/**
 * 相等条件通过对象来表达，对象字段类型必须是：Long, Integer, Float, Double, String, Date
 * 后续可支持其他类型
 *
 * 如果对象obj有两个字段: f1 and f2
 * obj.f1 = "hello"
 * obj.f2 = 100
 *
 * condition sql is : f1 = ? and f2 = ?
 * values: (1, "hello"), (2, 100)
 *
 * @param <T> 任意类型的对象
 */

@Builder
@Getter
@Setter
public class EqualCondition<T> implements SqlCondition {

    private T obj;

    @Override
    public ConditionOperator getConditionOperator() {
        return ConditionOperator.EQUAL;
    }

    @Override
    public Pair<String, Map<Integer, String>> conditionSql() {
        return Bean2SqlUtils.getEqualTypeConditionSql(obj, this.getConditionOperator());
    }
}
