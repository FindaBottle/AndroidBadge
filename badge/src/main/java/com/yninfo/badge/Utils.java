package com.yninfo.badge;

import java.util.Random;

/**
 * Created by zhaozhiping on 2017/6/20.
 */

public class Utils {
    /**
     * 生成序列号
     * @return
     */
    public static String createSerialNum() {
        long time = System.currentTimeMillis();
        return "UU"+time+randomNum(5);
    }

    /**
     * 随机生成数
     * @param num 要生成随机数的个数
     * @return
     */
    public static String randomNum(int num) {
        Random random = new Random();
        String numStr = "";
        for (int i = 0; i < num; i++) {
            numStr += random.nextInt(10);
        }
        return numStr;
    }
}
