package com.xu.structurePattern.adapterPattern;

/**
 * @Author xujianfeng
 * @DATE 2023/7/3 11:31
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
