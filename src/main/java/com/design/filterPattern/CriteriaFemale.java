package com.design.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author anyang
 * @CreateTime 2018/3/20
 * @Des
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
