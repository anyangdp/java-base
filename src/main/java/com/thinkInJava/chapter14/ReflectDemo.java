package com.thinkInJava.chapter14;

/**
 * @Author anyang
 * @CreateTime 2019/4/8
 * @Des
 * 调用isArray()的时候返回值是true，则说明是数组。
 * 上面说了，判断纯对象的时候，首先排除数组， 标记
 * 再排除一些枚举， 原始类型。
 * 为什么要排除这些?我的理解是：
 * 数组，标记，枚举，原始类型，这些不具有对象的基本特性：封装，继承，多态
 * 所以要排除掉.
 */
public class ReflectDemo {
    public static void main(String[] args) {
//        try {
//            Class<?> cc = Class.forName("com.thinkInJava.chapter14.RTTIDemo");
//            cc.newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
        char[] arr = {'a', 'b'};
        System.out.println(arr.getClass().isArray());
        System.out.println(arr.getClass().isEnum());
        System.out.println(arr.getClass().isPrimitive());

        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;

        Class<?> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
     }
}
