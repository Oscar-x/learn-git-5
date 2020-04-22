package com.juice.test;

import com.juice.utils.CallFunction;
import com.juice.utils.TernaryOperator;
import com.juice.utils.AssignVar;
import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;

public class TernaryOperatorTest {
    @Test
    public void ternaryOperatorTest() {
        CallFunction.CallFunction("整数 气温 等于 十");
        int qw = Variable.getVar("气温");
        Assert.assertEquals(10, qw);
        String s = "如果 气温 大于 八 则 气温 减少 四 否则 气温 减少 三";
        TernaryOperator.ternaryOperator(s);
        int qw1=Variable.getVar("气温");
        Assert.assertEquals(6, qw1);
    }
}
