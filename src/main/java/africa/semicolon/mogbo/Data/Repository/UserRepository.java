package africa.semicolon.mogbo.Data.Repository;

import africa.semicolon.mogbo.Data.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
