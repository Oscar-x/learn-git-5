package com.juice.utils;

/**
 * 解析条件判断句子 “如果...则...否则...” 的类
 */
public class TernaryOperator {
    /**
     *分解完String后分别调用 JudgeOperator.judgeOperator()和CallFunction.CallFunction()来进行判断与执行相应的语句
     *
     * @param str “如果...则...否则...” 句式的String
     */
    public static void ternaryOperator(String str){
        String[] Baa=str.split("则");
        String[] str1=Baa[0].trim().split("如果 ");
        String str2=str1[1];
        String[] str3=Baa[1].trim().split(" 否");
        String str4=str3[0];
        String str5=Baa[2].trim();
        if(JudgeOperator.judgeOperator(str2)){
            CallFunction.callFunction(str4);
        }
        else{
            CallFunction.callFunction(str5);
        }
    }
}


