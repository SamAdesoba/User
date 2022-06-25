package africa.semicolon.mogbo.Services;

import africa.semicolon.mogbo.dto.request.LoginRequest;
import africa.semicolon.mogbo.dto.request.RegisterUserRequest;
import africa.semicolon.mogbo.dto.responses.RegisterUserResponse;

public interface UserService {
	RegisterUserResponse registerUser(RegisterUserRequest request);

	void login(LoginRequest loginRequest);
}
