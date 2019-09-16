
package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.User;
import com.mikomaric.dentalassistant.domain.dto.UserDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    
    User UserDtoToUser(UserDto dto);
    List<User> usersDtoToUsers(List<UserDto> dtos);
    UserDto UserToUserDto(User user);
    
}
