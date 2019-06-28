package com.thinkInJava.chapter9.eg9_1;

/**
 * @Author anyang
 * @CreateTime 2019/4/2
 * @Des
 */
public class Music4 {
    static void tune(Instrument i) {
        i.play("ppp");
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchesta = {
                new Wind(), new Percussion(), new Stringed(),
                new Brass(), new Woodwind()
        };
        tuneAll(orchesta);

    }
}
