package com.juice.test;

import com.juice.utils.CallFunction;
import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;

public class CallFunctionTest {
    @Test
    public void CallFunctionTest() {
        CallFunction.CallFunction("整数 气温 等于 十");
        int temp = Variable.getVar("气温");
        Assert.assertEquals(10, temp);
        CallFunction.CallFunction("气温 减少 三");
        int temp1 = Variable.getVar("气温");
        Assert.assertEquals(7, temp1);
        /*CallFunction.CallFunction("看看 气温");*/

        /*CallFunction.CallFunction("如果 气温 大于 八 则 看看 “你好，世界” 否则 看看 “冻死我了”");*/


    }
}
