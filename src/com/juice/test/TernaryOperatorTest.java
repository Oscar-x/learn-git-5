package com.juice.test;

import com.juice.utils.TernaryOperator;
import com.juice.utils.AssignVar;
import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;

public class TernaryOperatorTest {
    @Test
    public void ternaryOperatorTest() {
        String s = "如果 钱包 大于 十 则 看看 “钱太多了” 否则 看看 “我穷死了”";
        TernaryOperator.ternaryOperator(s);
    }
}
