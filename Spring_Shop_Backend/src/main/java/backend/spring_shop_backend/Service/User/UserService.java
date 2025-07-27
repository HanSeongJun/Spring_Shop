package backend.spring_shop_backend.Service.User;

import backend.spring_shop_backend.Dto.Request.Auth.SignUpRequestDto;
import backend.spring_shop_backend.Dto.User.UserDto;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    public UserDetails loadUserByUsername(String email);
    public UserDto registerUser(SignUpRequestDto request);
}
