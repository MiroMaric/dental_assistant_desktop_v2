package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.User;
import com.mikomaric.dentalassistant.domain.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User UserDtoToUser(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setFirstname( dto.getFirstname() );
        user.setLastname( dto.getLastname() );
        user.setEmail( dto.getEmail() );
        user.setAddress( dto.getAddress() );
        user.setPhone( dto.getPhone() );
        user.setUsername( dto.getUsername() );
        user.setPassword( dto.getPassword() );

        return user;
    }

    @Override
    public List<User> usersDtoToUsers(List<UserDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtos.size() );
        for ( UserDto userDto : dtos ) {
            list.add( UserDtoToUser( userDto ) );
        }

        return list;
    }

    @Override
    public UserDto UserToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );
        userDto.setEmail( user.getEmail() );
        userDto.setFirstname( user.getFirstname() );
        userDto.setLastname( user.getLastname() );
        userDto.setAddress( user.getAddress() );
        userDto.setPhone( user.getPhone() );

        return userDto;
    }
}
