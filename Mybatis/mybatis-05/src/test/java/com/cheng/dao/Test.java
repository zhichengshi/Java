package com.cheng.dao;

import com.cheng.pojo.Student;
import com.cheng.pojo.Teacher;
import com.cheng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {

    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.getTeacher2(1);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
}
