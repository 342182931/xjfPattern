package com.xu.structurePattern.bridgePattern;

/**
 * @Author xujianfeng
 * @DATE 2023/7/3 16:57
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
