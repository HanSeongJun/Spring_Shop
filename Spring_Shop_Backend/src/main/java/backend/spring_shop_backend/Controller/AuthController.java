package backend.spring_shop_backend.Controller;

import backend.spring_shop_backend.Dto.User.SignUpRequest;
import backend.spring_shop_backend.Service.User.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {

    private final UserService userService;

    @PostMapping("/signUp")
    public void signUp(@RequestBody SignUpRequest request) {
        userService.registerUser(request);
    }
}
