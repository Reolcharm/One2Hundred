package me.reolcharm.webtable.service;

import me.reolcharm.webtable.domain.User;

import java.util.List;

public interface MyService1st {
    User searchUser(User loginUser);
    int add(User userBean);
    List<User> queryAll();

    User findUserById(User idUserBean);
}
