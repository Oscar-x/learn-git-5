package com.juice.utils;

/**
 * 识别语句关键字，调用对应方法
 */
public class CallFunction {
    /**
     * 对传入语句的第一个词进行判断，调用相应类
     *
     * @param str 传入的字符串
     * @return
     */
    public static String callFunction(String str) {

        String[] str1 = str.split("\\s+");
        String varStr = str1[0];
        switch (varStr) {
            case "整数":
                AssignVar.assignVar(str);
                return null;
            case "气温":
                ManipulateNum.manipulateNum(str);
                return null;
            case "看看":
                return Printout.printOut(str);
            case "如果":
                TernaryOperator.ternaryOperator(str);
                return null;
        }
        return null;
    }
}
