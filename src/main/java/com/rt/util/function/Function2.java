package com.rt.util.function;

import java.util.Objects;
import java.util.function.Function;

/**
 * @Author anyang
 * @CreateTime 2024/1/12
 * @Des
 */
@FunctionalInterface
public interface Function2<T, R> {
    R apply(T t);

    default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }
}
