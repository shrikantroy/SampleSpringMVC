package com.sample.springmvc.dao;

import com.sample.springmvc.model.Login;
import com.sample.springmvc.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}
