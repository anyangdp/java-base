package com.thinkInJava.chapter10;

/**
 * @Author anyang
 * @CreateTime 2019/4/3
 * @Des
 */
public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    protected class PDestination implements Destination {
        private String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s) {
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());

        Parcel4.PDestination pp = p.new PDestination("ds");
        System.out.println(pp.readLabel());
    }
}
