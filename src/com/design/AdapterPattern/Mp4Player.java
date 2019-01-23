package com.design.AdapterPattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
