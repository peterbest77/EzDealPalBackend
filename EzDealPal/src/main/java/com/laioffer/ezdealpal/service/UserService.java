package com.laioffer.ezdealpal.service;

import com.laioffer.ezdealpal.dao.UserDao;
import com.laioffer.ezdealpal.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao= userDao;
    }

    public void signUp(User user) {
        userDao.signUp(user);
    }

    public User getCustomer(String userId) {
        return userDao.getUser(userId);
    }
}
