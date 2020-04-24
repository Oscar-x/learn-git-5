package com.juice.utils;

import java.util.Scanner;
/**
 *主类
 */
public class RunMain {
    /**
     *循环读取用户输入并调用callFunction
     * @param args 控制台输入字符串，例如“整数 气温 等于 十”
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           while(true){
            String varStr = sc.nextLine();
            CallFunction.callFunction(varStr);
        }


    }
}
