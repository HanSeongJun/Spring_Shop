package backend.spring_shop_backend.Service.User.Implement;

import backend.spring_shop_backend.Dto.User.SignUpRequest;
import backend.spring_shop_backend.Dto.User.UserDto;
import backend.spring_shop_backend.Entity.User.User;
import backend.spring_shop_backend.Repository.User.UserRepository;
import backend.spring_shop_backend.Service.User.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImplement implements UserService, UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("사용자를 찾을 수 없습니다. : " + email));
    }

    @Override
    public UserDto registerUser(SignUpRequest request) {

        // 이메일 중복 체크
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("이미 가입된 이메일입니다.");
        }

        // 사용자 생성
        User user = User.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .name(request.getName())
                .phone(request.getPhone())
                .address(request.getAddress())
                .build();

        User savedUser = userRepository.save(user);
        return UserDto.from(savedUser);
    }
}