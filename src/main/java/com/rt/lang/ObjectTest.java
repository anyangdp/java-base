package com.rt.lang;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @Author anyang
 * @CreateTime 2024/1/3
 * @Des
 */
public class ObjectTest {
    public Logger logger = Logger.getLogger("ObjectTest");
    @Test
    public void test1() {
        System.out.println(123);
    }
    // 基本数据类型不可变及可变
    @Test
    public void test2() {
        Integer a = 1;
        a= 3;
        System.out.println(3);
        int b = 1;
        logger.info("123");
    }

    // 装箱拆箱性能测试
    @Test
    public void test3() {
        logger.info(LocalDateTime.now().toString());
        List<Integer> numbers = new ArrayList<>();

// Autoboxing in a loop
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);  // Autoboxing: int to Integer
        }

// Unboxing in a loop
        for (Integer num : numbers) {
            int value = num;  // Unboxing: Integer to int
        }
        logger.info(LocalDateTime.now().toString());
    }
    // Integer测试
    // 在比较 c == a 时，会涉及到自动拆箱（a 被自动拆箱为 int）和自动装箱（a 被自动装箱为 Integer）的过程。
    //
    // 在 Java 中，自动拆箱和自动装箱时通过调用 intValue() 和 Integer.valueOf(int) 方法来完成的。
    // ava 会将 a 自动装箱为 Integer 对象，然后进行引用比较。在某些 JVM 实现中，由于整数值的缓存机制，可能导致 c 和 a 引用相同的 Integer 对象。
    // 但这不是 Java 语言规范所保证的，因此不同的 JVM 可能有不同的结果。
    @Test
    public void test4() {
        int a = 129;
        int b = 129;
        System.out.println(a == b);
        Integer c = 129;
        Integer d = 129;
        System.out.println(c == d);
        System.out.println(a == c);
        System.out.println(c == a);

        int maxValue = Integer.MAX_VALUE;
        int overflowed = maxValue + 1;
        System.out.println(overflowed);
        int e = -1;
        int i = Integer.compareUnsigned(e, c);
        System.out.println(i);
        int f = 0;
        System.out.println(e > f);

        Integer g = e - c;
        System.out.println(g);
    }


    @Test
    public void stringTest() {
        String str = "af*cd";
        System.out.println("str.codePointAt(0):"+ str.codePointAt(0));
        System.out.println("str.codePointAt(0):"+ str.codePointAt(2));
        System.out.println("str.codePointAt(0):"+ str.codePointAt(1));
    }
}
