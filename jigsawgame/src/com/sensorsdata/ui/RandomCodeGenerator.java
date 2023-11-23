package com.sensorsdata.ui;

import java.util.Random;

public class RandomCodeGenerator {
    //指定验证码的长度
    public static  String getCode(int num) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // 创建一个Random对象
        Random random = new Random();

        // 生成验证码
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < num; i++) {
            // 生成随机索引
            int randomIndex = random.nextInt(characters.length());

            // 根据随机索引获取字符，并追加到验证码中
            code.append(characters.charAt(randomIndex));
        }
        return code.toString();
    }

}
