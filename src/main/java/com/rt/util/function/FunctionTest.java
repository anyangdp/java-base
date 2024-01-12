package com.rt.util.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @Author anyang
 * @CreateTime 2024/1/12
 * @Des
 */
public class FunctionTest {
    @Test
    public void test() {
        // 使用 Lambda 表达式定义一个 Function 实例
        Function<String, Integer> intToString = x -> Integer.valueOf(x + 10);
        Function<String, Integer> stringIntegerFunction = Integer::parseInt;
        // 应用函数
        Integer result = intToString.apply("10");
        System.out.println(result);
    }


    @Test
    public void test2() {
        List<String> words = Arrays.asList("apple", "banana", "orange");

        List<String> result = words.stream()
                .map(Function.identity())
                .collect(Collectors.toList());

        System.out.println(result);
    }
    @Test
    public void test3() {
        Function2<Integer, String> t = f -> "f" + f;
        System.out.println(t.apply(1));
    }

    @Test
    public void test4() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Predicate<String> lengthGreaterThan3 = s -> s.length() > 3;

        // 使用 Predicate 过滤字符串列表
        names.stream()
                .filter(lengthGreaterThan3)
                .forEach(System.out::println);
    }

    @Test
    public void test5() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Consumer<String> printName = System.out::println;

        // 使用 Consumer 打印字符串列表
        names.forEach(printName);
    }
    @Test
    public void test6() {
        Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(100);

        // 使用 Supplier 生成随机数
        int randomNumber = randomIntegerSupplier.get();
        System.out.println("Random Number: " + randomNumber);
    }

}
