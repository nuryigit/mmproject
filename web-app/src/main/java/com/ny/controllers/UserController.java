package com.ny.controllers;

import com.ny.domain.UserCommand;
import com.ny.entities.User;
import org.ny.converters.UserMapper;

public class UserController {

  User saveUser(UserCommand userCommand) {
    //fake impl
    return UserMapper.INSTANCE.userCommandToUser(userCommand);
  }
}
