package africa.semicolon.mogbo.dto.request;

import lombok.Data;

@Data
public class LoginRequest {
	private String email;
	private String password;
}
