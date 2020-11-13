package com.cheng.pojo;

import lombok.Data;

@Data
public class Student {
    private int sid;
    private String name;
    private Teacher teacher;
}
