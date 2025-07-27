package backend.spring_shop_backend.Service.User;

import backend.spring_shop_backend.Dto.UserDto;
import backend.spring_shop_backend.Entity.User.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    public UserDetails loadUserByUsername(String email);

}
