package africa.semicolon.mogbo.Data.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Document("Users")

public class User {
	@Id
	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private LocalDateTime dateRegistered = LocalDateTime.now();
}
