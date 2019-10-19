package com.richard.feature.java8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/18 17:24
 **/
public class People {
    private List<Person> persons= new ArrayList<Person>();

    public List<Person> getMaleList(PersonInterface filter) {
        List<Person> res = new ArrayList<Person>();
        persons.forEach((Person person)->{
            res.add(person);
        });


        return res;
    }
}


