package com.juice.utils;

import org.junit.Test;

public class CallFunction {
    @Test
    public static void CallFunction(String str) {

        String[] str1 = str.split("\\s+");
        String varStr = str1[0];
        switch (varStr) {
            case "整数":
                AssignVar.assignVar(str);
                System.out.println("初始值设置成功");break;
            case "气温":
                ManipulateNum.manipulateNum(str);
                System.out.println("修改成功");break;
            case "看看":
                /*PrintOut.printOut(str);
                System.out.println("输出成功");break;/
            case "如果":
               /* TernaryOperator.ternaryOperator(str);
                System.out.println("正在进行对比");break;*/
        }
    }
}
