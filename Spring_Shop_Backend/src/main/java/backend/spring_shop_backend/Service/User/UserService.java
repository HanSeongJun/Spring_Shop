package backend.spring_shop_backend.Service.User;

import backend.spring_shop_backend.Dto.User.SignUpRequest;
import backend.spring_shop_backend.Dto.User.UserDto;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    public UserDetails loadUserByUsername(String email);
    public UserDto registerUser(SignUpRequest request);
}
