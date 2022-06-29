package africa.semicolon.mogbo.Controllers;

import africa.semicolon.mogbo.Services.UserService;
import africa.semicolon.mogbo.dto.request.LogInRequest;
import africa.semicolon.mogbo.dto.request.RegisterUserRequest;
import africa.semicolon.mogbo.dto.responses.LoginUserResponse;
import africa.semicolon.mogbo.dto.responses.RegisterUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public RegisterUserResponse register(@RequestBody RegisterUserRequest registerUserRequest){
		return userService.registerUser(registerUserRequest);
	}

	@PostMapping("/login")
	public LoginUserResponse login(@RequestBody LogInRequest userLoginRequest){
		return userService.login(userLoginRequest);
	}
}

