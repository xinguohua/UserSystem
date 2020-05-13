package cn.tju.service;

import cn.tju.dao.UserDao;
import cn.tju.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserService {
    UserDao userDao=new UserDao();
    public boolean insert(User user){
        if(!userDao.isExist(user.getUserno()))
        { userDao.insert(user);
           return  true;
        }
        else{
            System.out.println("此人已经存在");
            return false;
        }

    }

    public boolean delete(int uno){
        if(userDao.isExist(uno))
        { userDao.delete(uno);
            return  true;
        }
        else{
            System.out.println("此人不存在");
            return false;
        }


    }

    public boolean update(int uno,User user) {
        if (userDao.isExist(uno)) {
            userDao.update(uno, user);
        }
        return  false;
    }

    public User queryUserByUno(int uno){
            if(userDao.isExist(uno)){

                return userDao.queryUserByUno(uno);
            }
            return null;

    }

    public ArrayList<User> queryAll() throws SQLException {
        ArrayList<User> users = userDao.queryAll();
        return users;

    }


    }





