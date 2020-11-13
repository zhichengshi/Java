package com.cheng.dao;

import com.cheng.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    Teacher getTeacher(@Param("tid") int id);
}
