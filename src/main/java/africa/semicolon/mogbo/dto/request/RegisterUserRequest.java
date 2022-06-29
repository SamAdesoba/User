package africa.semicolon.mogbo.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RegisterUserRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDateTime date;
}
