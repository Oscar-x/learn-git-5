package com.juice.utils;

public class TernaryOperator {
    /**
     *将读入字符串拆成3份进行三目运算
     *
     */
    public static void ternaryOperator(String str){
        String[] Baa=str.split("则");
        String[] ifs=Baa[0].trim().split("如果 ");
        String ifc=ifs[1];
        String[] zes=Baa[1].trim().split(" 否");
        String ze=zes[0];
        String fz=Baa[2].trim();
        System.out.println("....................");
        if(JudgeOperator.judgeOperator(ifc)){
            CallFunction.CallFunction(ze);
        }
        else{
            CallFunction.CallFunction(fz);
        }
    }
}


