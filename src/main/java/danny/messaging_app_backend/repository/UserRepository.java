package danny.messaging_app_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import danny.messaging_app_backend.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByFirebaseUid(String firebaseUid);
}
