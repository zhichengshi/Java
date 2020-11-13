package com.cheng.dao;

import com.cheng.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacher(@Param("tid") int id);
    List<Teacher> getTeacher2(@Param("tid") int id);
}
