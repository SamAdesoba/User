package africa.semicolon.mogbo.Services;

import africa.semicolon.mogbo.dto.request.LogInRequest;
import africa.semicolon.mogbo.dto.request.RegisterUserRequest;
import africa.semicolon.mogbo.dto.responses.LoginUserResponse;
import africa.semicolon.mogbo.dto.responses.RegisterUserResponse;

public interface UserService {
	RegisterUserResponse registerUser(RegisterUserRequest request);

	LoginUserResponse login(LogInRequest loginRequest);
}
