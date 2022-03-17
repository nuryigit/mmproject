package org.ny.converters;

import com.ny.domain.UserCommand;
import com.ny.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserCommand userToUSerCommand(User user);

  User userCommandToUser(UserCommand userCommand);
}
