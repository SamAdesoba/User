package africa.semicolon.mogbo.Services;

import africa.semicolon.mogbo.Data.Models.User;
import africa.semicolon.mogbo.Data.Repository.UserRepository;
import africa.semicolon.mogbo.Exceptions.LogInException;
import africa.semicolon.mogbo.dto.request.LogInRequest;
import africa.semicolon.mogbo.dto.request.RegisterUserRequest;
import africa.semicolon.mogbo.dto.responses.LoginUserResponse;
import africa.semicolon.mogbo.dto.responses.RegisterUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public RegisterUserResponse registerUser(RegisterUserRequest request) {
		User user = new User();
		user.setEmail(request.getEmail());
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setPassword(request.getPassword());
		User savedUser = userRepository.save(user);
		RegisterUserResponse response = new RegisterUserResponse();
		response.setEmail(savedUser.getEmail());
		response.setDateCreated(DateTimeFormatter.ofPattern("EEEE,dd/MM/yyyy, hh:mm, a").format(savedUser.getDateRegistered()));
		return response;
	}

	@Override
	public LoginUserResponse login(LogInRequest loginRequest) {
		User existing =  userRepository.findUserByEmail(loginRequest.getEmail()).
				  orElseThrow(() -> new LogInException("User not found"));
		LoginUserResponse response = new LoginUserResponse();
		if(Objects.equals(existing.getPassword(), loginRequest.getPassword())){
			response.setLoginMessage("Logged in successfully!!!");

		}
		return response;
	}
}
