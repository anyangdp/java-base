package com.design.filterPattern;

import java.util.List;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
