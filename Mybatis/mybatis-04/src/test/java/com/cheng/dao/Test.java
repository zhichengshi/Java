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
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }


        sqlSession.close();
    }
}
