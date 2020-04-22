package com.juice.utils;

import org.junit.Test;

/**
 * 识别语句关键字，调用对应方法
 */
public class CallFunction {
    /**
     * 对传入语句的第一个词进行判断，调用相应类
     * @param str 传入的字符串
     */
    public static void CallFunction(String str) {

        String[] str1 = str.split("\\s+");
        String varStr = str1[0];
        switch (varStr) {
            case "整数":
                AssignVar.assignVar(str);break;
            case "气温":
                ManipulateNum.manipulateNum(str);break;
            case "看看":
                /*PrintOut.printOut(str);break;/
            case "如果":
               /* TernaryOperator.ternaryOperator(str);break;*/
        }
    }
}
