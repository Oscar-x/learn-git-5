package com.juice.utils;



import com.sun.org.apache.xpath.internal.objects.XString;
import sun.awt.windows.WPrinterJob;

public class TernaryOperator {
    /**
     *将读入字符串拆成3份进行三目运算
     *
     */
    public static void ternaryOperator(String str){
        String[] Baa=str.split("则");
        String[] ifu=Baa[0].trim().split("如果 ");
        String ifuu=ifu[1];
        String[] zes=Baa[1].trim().split(" 否");
        String ze=zes[0];
        String fz=Baa[2].trim();
        System.out.println("....................");

        if(JudgeOperator.judgeOperator(ifuu)){
            CallFunction.CallFunction(ze);
        }
        else{
            CallFunction.CallFunction(fz);
        }
    }
}


