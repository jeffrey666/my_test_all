package com.dudo.dailytest;

/**
 * User: zk
 * Date: 13-7-31
 * Time: 下午1:14
 */
public class InTheLoop {
    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 2;

    public static void main(String[] args) {
        int count = 0;
        for (int i = START; i < END; i++)
            count++;
        System.out.println(count);
    }
}
