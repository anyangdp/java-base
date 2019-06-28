package com.thinkInJava.chapter11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author anyang
 * @CreateTime 2019/4/4
 * @Des
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String name;
    private Integer age;

}
