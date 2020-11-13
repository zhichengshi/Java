package com.cheng.dao;

import com.cheng.pojo.User;
import com.cheng.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获得session
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行方法
        UserDao usrDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = usrDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.addUser(new User(5, "杨", "123456"));
        if(res>0)
            System.out.println("插入成功");
        else
            System.out.println("插入失败");

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.updateUser(new User(5, "杨志", "123456"));
        if(res>0)
            System.out.println("更新成功");
        else
            System.out.println("更新失败");

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.deleteUser(5);
        if(res>0)
            System.out.println("删除成功");
        else
            System.out.println("删除失败");

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void getUserListLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> userListLike = mapper.getUserListLike("%李%");
        for (User user : userListLike) {
            System.out.println(user);
        }
        sqlSession.close();

    }

}
