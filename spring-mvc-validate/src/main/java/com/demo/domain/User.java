package com.demo.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * Created by lwx on 2019/5/10.
 */
public class User {

    private Integer id;
    @NotBlank(message = "姓名不能为空")
    private String name;

    /**
     * 如何保证传来的是一个数字型？
     *
     * @Pattern( regexp = "\\d")  //@Pattern不能用于integer类型
     *
     * ？
     *
     */
    @NotNull
    @Range(max = 150, min = 0)
    @Digits(integer = 3, fraction =0 )
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
