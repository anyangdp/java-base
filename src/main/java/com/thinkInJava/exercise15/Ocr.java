package com.thinkInJava.exercise15;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
public class Ocr extends Villain {
    private int ocrNumber;

    public Ocr(String name, int ocrNumber) {
        super(name);
        this.ocrNumber = ocrNumber;
    }

    public void change(String name, int ocrNumber) {
        set(name);
        this.ocrNumber = ocrNumber;
    }

    @Override
    public String toString() {
        return "Ocr{" +
                "ocrNumber=" + ocrNumber +
                '}' + super.toString();
    }

    public static void main(String[] args) {
        Ocr o = new Ocr("zs", 1);
        o.set("李四");
        System.out.println(o);
        o.change("we", 2);
        System.out.println(o);
    }
}
