package mate.academy.spring.mapper.impl.response;

import mate.academy.spring.dto.response.UserResponseDto;
import mate.academy.spring.mapper.DtoResponseMapper;
import mate.academy.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserResponseMapper implements DtoResponseMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto toDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setEmail(user.getEmail());
        return userResponseDto;
    }
}