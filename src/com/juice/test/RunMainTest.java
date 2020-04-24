package com.juice.test;


import com.juice.utils.CallFunction;
import com.juice.utils.Variable;
import org.junit.Assert;
import org.junit.Test;

public class RunMainTest {

    @Test
    public void runMainTest() {
        String str1 = "整数 气温 等于 十";
        CallFunction.callFunction(str1);
        int var = Variable.getVar("气温");
        Assert.assertEquals(10, var);

        String str2= "气温 减少 三";
        CallFunction.callFunction(str2);
        int var1 = Variable.getVar("气温");
        Assert.assertEquals(7, var1);

        String str3= "看看 气温";
        CallFunction.callFunction(str3);
        int var2 = Variable.getVar("气温");
        Assert.assertEquals(7, var2);

        String str4= "如果 气温 大于 八 则 看看 “你好，世界” 否则 看看 “冻死我了”";
        CallFunction.callFunction(str4);
        int var3 = Variable.getVar("气温");
        Assert.assertEquals(7, var3);
    }

}
