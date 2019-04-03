package com.thinkInJava.chapter10;

/**
 * @Author anyang
 * @CreateTime 2019/4/3
 * @Des
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;
        public int value() {return i;}
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        private ParcelDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
        public static void f() {}

        static int x = 10;

        static class AnotherLevel {
            public static void f() {}
            static int x = 10;
        }
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static void main(String[] args) {
        Contents contents = contents();
        System.out.println(contents.value());
        ParcelDestination dt = (ParcelDestination) destination("Tasmania");

    }
}
