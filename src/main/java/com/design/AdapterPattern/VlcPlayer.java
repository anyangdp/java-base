package com.design.AdapterPattern;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
