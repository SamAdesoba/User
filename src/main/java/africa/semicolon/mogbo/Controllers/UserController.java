package africa.semicolon.mogbo.Controllers;

import africa.semicolon.mogbo.Services.UserService;
import africa.semicolon.mogbo.dto.request.LoginRequest;
import africa.semicolon.mogbo.dto.request.RegisterUserRequest;
import africa.semicolon.mogbo.dto.responses.RegisterUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/User")
	public RegisterUserResponse register(@RequestBody RegisterUserRequest registerUserRequest){
		return userService.registerUser(registerUserRequest);
	}

	@PostMapping("/User")
	public void login(@RequestBody LoginRequest request){
		 userService.login(request);
	}
}

