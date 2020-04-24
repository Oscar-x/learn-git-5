package com.juice.utils;

import java.util.Scanner;
/**
 *主类，循环输入，调用CallFunction
 */
public class RunMain {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           while(true){
            String varStr = sc.nextLine();
            CallFunction.callFunction(varStr);
        }


    }
}
